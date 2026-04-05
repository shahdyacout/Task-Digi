package com.example.taskdigi.domain.usecase

import com.example.taskdigi.data.model.Item
import com.example.taskdigi.domain.repository.TaskRepository
import com.example.taskdigi.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class getItemUsecase @Inject constructor (private  val repo : TaskRepository) {

    suspend operator fun invoke(): Flow<List<Item>>{
        return   repo.getItems()
    }

}