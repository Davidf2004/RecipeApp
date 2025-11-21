package com.pjasoft.recipeapp.domain.repository

import com.pjasoft.recipeapp.domain.model.Recipe

interface RecipeRepository {

    suspend fun getRecentRecipes(): List<Recipe>

    suspend fun getAllRecipes(): List<Recipe>

    suspend fun getQuickIdeas(): List<Recipe>
}