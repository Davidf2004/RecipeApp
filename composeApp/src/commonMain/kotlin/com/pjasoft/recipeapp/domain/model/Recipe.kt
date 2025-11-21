package com.pjasoft.recipeapp.domain.model

data class Recipe(
    val id: String,
    val title: String,
    val subtitle: String,
    val imageUrl: String,
    val category: String,
    val timeMinutes: Int,
    val difficulty: Int,
    val ingredients: List<String>,
    val steps: List<String>,
    val isQuick: Boolean,
    val isRecent: Boolean
)