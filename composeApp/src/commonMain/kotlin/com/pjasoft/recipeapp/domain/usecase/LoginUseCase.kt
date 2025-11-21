package com.pjasoft.recipeapp.domain.usecase

import com.pjasoft.recipeapp.domain.repository.AuthRepository

class LoginUseCase(
    private val repository: AuthRepository
) {
    suspend operator fun invoke(email: String, password: String): Boolean =
        repository.login(email, password)
}