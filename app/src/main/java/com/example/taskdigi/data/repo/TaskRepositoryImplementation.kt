package com.example.taskdigi.data.repo

import com.example.taskdigi.data.local.dao.ItemDao
import com.example.taskdigi.data.model.Item
import com.example.taskdigi.data.remote.api.ApiService
import com.example.taskdigi.domain.repository.TaskRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import toDomain
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TaskRepositoryImplementation @Inject constructor(
    private val apiService: ApiService,
    private val itemDao: ItemDao
) : TaskRepository {
    override suspend fun getItems(): Flow<List<Item>> {
        return flow {
            try {
                val items = apiService.getItems()
                emit(items.map { it.toDomain() })

            } catch (e: Exception) {
                println("Debug: Error fetching items: ${e.message}")
                emitAll(
                    itemDao.getAllItems().map { list ->
                        list.map { it.toDomain() }
                    }
                )
            }
        }
    }

}