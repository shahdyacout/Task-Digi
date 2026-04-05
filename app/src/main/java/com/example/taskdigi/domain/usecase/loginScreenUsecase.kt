package com.example.taskdigi.domain.usecase

import com.example.taskdigi.data.model.User
import com.example.taskdigi.domain.repository.UserRepository
import javax.inject.Inject

class loginScreenUsecase @Inject constructor(private val repo : UserRepository) {
    suspend operator fun invoke (userName:String,password: String): User{
        return repo.login(userName, password)
    }
}