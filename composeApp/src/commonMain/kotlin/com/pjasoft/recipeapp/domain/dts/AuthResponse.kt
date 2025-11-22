package com.pjasoft.recipeapp.domain.dts

import kotlinx.serialization.Serializable

@Serializable
data class AuthResponse(
    val message : String,
    val isLogged : Boolean,
    val userId : Int
)
