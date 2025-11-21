package com.pjasoft.recipeapp.data.repository

import com.pjasoft.recipeapp.data.services.RecipeLocalDataSource
import com.pjasoft.recipeapp.domain.model.Recipe
import com.pjasoft.recipeapp.domain.repository.RecipeRepository

class RecipeRepositoryImpl(
    private val localDataSource: RecipeLocalDataSource
) : RecipeRepository {

    override suspend fun getRecentRecipes(): List<Recipe> {
        return localDataSource
            .getAll()
            .filter { it.isRecent }
    }

    override suspend fun getAllRecipes(): List<Recipe> {
        return localDataSource.getAll()
    }

    override suspend fun getQuickIdeas(): List<Recipe> {
        return localDataSource
            .getAll()
            .filter { it.isQuick }
    }
}