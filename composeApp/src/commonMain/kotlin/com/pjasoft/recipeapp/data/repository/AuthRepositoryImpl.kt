package com.pjasoft.recipeapp.data.repository

import com.pjasoft.recipeapp.data.services.AuthLocalDataSource
import com.pjasoft.recipeapp.domain.repository.AuthRepository

class AuthRepositoryImpl(
    private val localDataSource: AuthLocalDataSource
) : AuthRepository {

    override suspend fun login(email: String, password: String): Boolean {
        return localDataSource.login(email, password)
    }
}