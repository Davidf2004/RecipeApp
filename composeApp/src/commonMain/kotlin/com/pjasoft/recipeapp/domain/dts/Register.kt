package com.pjasoft.recipeapp.domain.dts

import kotlinx.serialization.Serializable

@Serializable
data class Register(
    val name : String,
    val email : String,
    val password : String
)
