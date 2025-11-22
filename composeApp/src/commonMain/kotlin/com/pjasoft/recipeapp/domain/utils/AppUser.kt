package com.pjasoft.recipeapp.domain.utils

import com.russhwolf.settings.Settings

object AppUser {
    private val settings: Settings = Settings()

    fun saveUserId(userId: Int) {
        settings.putInt("userId", userId)
    }

    fun saveIsLogged(isLogged: Boolean) {
        settings.putBoolean("isLogged", isLogged)
    }

    fun getIsLogged(): Boolean {
        return settings.getBoolean("isLogged", false)
    }

    fun getUserId(): Int {
        return settings.getInt("userId", 0)
    }

    fun saveUserName(name: String) {
        settings.putString("userName", name)
    }

    fun getUserName(): String {
        return settings.getString("userName", "Usuario")
    }

    fun clearSettings() {
        settings.clear()
    }
}