package com.example.taskdigi.domain.repository

import com.example.taskdigi.data.model.Item
import kotlinx.coroutines.flow.Flow

interface TaskRepository {
    suspend fun  getItems(): Flow<List<Item>>

}