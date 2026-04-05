import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.foundation.lazy.items


@Composable
fun ListScreen(
    username: String,
    viewModel: ItemViewModel = hiltViewModel()
) {

    val items by viewModel.items.collectAsState()

    Column {
        Text("Welcome $username")

        LazyColumn {
            items(items) {
                Text(it.title)
            }
        }
    }
}