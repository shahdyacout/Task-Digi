import com.example.taskdigi.data.local.entity.ItemEntity
import com.example.taskdigi.data.model.Item
import com.example.taskdigi.data.remote.dto.ItemDto

fun ItemDto.toEntity() = ItemEntity(
    id = id,
    title = title,
    description = body
)

fun ItemEntity.toDomain() = Item(
    id = id,
    title = title,
    description = description
)

fun ItemDto.toDomain() = Item(
    id = id,
    title = title,
    description = body
)
