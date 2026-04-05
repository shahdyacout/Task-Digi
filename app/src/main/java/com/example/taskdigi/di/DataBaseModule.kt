package com.example.taskdigi.di

import android.content.Context
import androidx.room.Room
import com.example.taskdigi.data.local.dao.ItemDao
import com.example.taskdigi.data.local.database.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "app_db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideDao(db: AppDatabase): ItemDao {
        return db.itemDao()
    }
}