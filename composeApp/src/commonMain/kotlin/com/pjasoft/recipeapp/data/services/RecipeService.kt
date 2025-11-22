package com.pjasoft.recipeapp.data.services

import com.pjasoft.recipeapp.domain.dts.RecipeP
import com.pjasoft.recipeapp.domain.dts.RecipeD
import com.pjasoft.recipeapp.domain.models.Recipe
import de.jensklingenberg.ktorfit.http.Body
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.POST
import de.jensklingenberg.ktorfit.http.Query

interface RecipeService {
    @POST("recipes/ai-generate")
    suspend fun generateRecipe(@Body recipeP: RecipeP) : RecipeD

    @GET("recipes")
    suspend fun getRecipesByUserId(@Query("userId") userId: Int) : List<Recipe>

    @POST("recipes")
    suspend fun saveGeneratedRecipe(@Body recipe: Recipe) : Recipe
}