package com.example.taskdigi.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey


    @Entity(tableName = "items")
    data class ItemEntity(
        @PrimaryKey(autoGenerate=true)
        val id :Int,
        val title :String,
        val description: String
    )
