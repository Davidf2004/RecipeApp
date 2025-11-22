package com.pjasoft.recipeapp.domain.dts

import kotlinx.serialization.Serializable

@Serializable
data class Login(
    val email : String,
    val password : String
)
