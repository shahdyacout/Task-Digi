package com.example.taskdigi.domain.repository

import android.content.ClipData
import com.example.taskdigi.data.model.Item
import com.example.taskdigi.data.model.User
import kotlinx.coroutines.flow.Flow

interface UserRepository {
    suspend fun login (userName : String ,password: String): User
}