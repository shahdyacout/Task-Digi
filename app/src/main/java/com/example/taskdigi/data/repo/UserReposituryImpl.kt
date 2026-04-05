package com.example.taskdigi.data.repo

import com.example.taskdigi.data.model.User
import com.example.taskdigi.domain.repository.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(

) : UserRepository {
    override suspend fun login(userName: String, password: String): User {

        TODO("Not yet implemented")
    }
}