package com.pjasoft.recipeapp.domain.usecase

import com.pjasoft.recipeapp.domain.model.Recipe
import com.pjasoft.recipeapp.domain.repository.RecipeRepository

class GetAllRecipesUseCase(
    private val repository: RecipeRepository
) {
    suspend operator fun invoke(): List<Recipe> =
        repository.getAllRecipes()
}