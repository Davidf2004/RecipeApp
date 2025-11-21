package com.pjasoft.recipeapp.data.services

class AuthLocalDataSource {
    private val validEmail = "test@test.com"
    private val validPassword = "123456"

    fun login(email: String, password: String): Boolean {
        return email == validEmail && password == validPassword
    }
}