package com.example.taskdigi.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.taskdigi.data.local.entity.ItemEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ItemDao {
     @Query("SELECT * FROM items")
      fun getAllItems(): Flow<List<ItemEntity>>

     @Insert(onConflict =OnConflictStrategy.REPLACE)
      fun insertItem(item:ItemEntity)
}