package com.pjasoft.recipeapp.data.services

import com.pjasoft.recipeapp.domain.dts.AuthResponse
import com.pjasoft.recipeapp.domain.dts.Login
import com.pjasoft.recipeapp.domain.dts.Register
import de.jensklingenberg.ktorfit.http.Body
import de.jensklingenberg.ktorfit.http.POST

interface AuthService {

    @POST("auth/register")
    suspend fun register (@Body register: Register) : AuthResponse

    @POST("auth/login")
    suspend fun login(@Body login: Login) : AuthResponse
}