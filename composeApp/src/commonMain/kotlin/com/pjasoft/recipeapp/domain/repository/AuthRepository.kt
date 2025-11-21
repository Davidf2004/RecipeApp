package com.pjasoft.recipeapp.domain.repository

interface AuthRepository {
    suspend fun login(email: String, password: String): Boolean
}