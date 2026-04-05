package com.example.taskdigi.data.remote.api

import com.example.taskdigi.data.remote.dto.ItemDto
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET

interface ApiService {
    @GET("posts")
    suspend fun getItems(): List<ItemDto>
}
