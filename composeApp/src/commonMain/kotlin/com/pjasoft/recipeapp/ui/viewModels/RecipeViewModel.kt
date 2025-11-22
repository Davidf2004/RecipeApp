package com.pjasoft.recipeapp.ui.viewModels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pjasoft.recipeapp.data.ktorfitClient
import com.pjasoft.recipeapp.domain.dts.RecipeP
import com.pjasoft.recipeapp.domain.dts.RecipeD
import com.pjasoft.recipeapp.domain.models.Recipe
import com.pjasoft.recipeapp.domain.utils.AppUser
import kotlinx.coroutines.launch


class RecipeViewModel : ViewModel() {
    val recipeService = ktorfitClient.createRecipeService()

    var recipes by mutableStateOf<List<Recipe>>(listOf())

    var generatedRecipe by mutableStateOf<RecipeD?>(null)

    var showSheet by mutableStateOf(false)
    var isLoading by mutableStateOf(false)

    init {
        getRecipes()
    }

    fun showModalFromList(recipe : RecipeD){
        generatedRecipe = recipe
        showSheet = true
    }

    fun hideModal(){
        showSheet = false
    }

    fun generateRecipe(recipeP: RecipeP){
        viewModelScope.launch {
            try {
                isLoading = true
                val result = recipeService.generateRecipe(recipeP)
                showSheet = true
                generatedRecipe = result
                println(result.toString())
            }
            catch (e : Exception){
                showSheet = false
                println(e.toString())
            }
            finally {
                isLoading = false
            }
        }
    }

    fun getRecipes(){
        viewModelScope.launch {
            try {
                val uid = AppUser.getUserId()
                println("getRecipes() userId = $uid")
                val result = recipeService.getRecipesByUserId(uid)
                println("getRecipes() result size = ${result.size}")
                recipes = result.takeLast(5).reversed()
            } catch (e : Exception){
                println("Error en getRecipes: $e")
            }
        }
    }

    fun saveRecipeInDb(){
        val generated = generatedRecipe ?: return
        viewModelScope.launch {
            try {
                val uid = AppUser.getUserId()
                println("saveRecipeInDb() userId = $uid")
                val recipe = Recipe(
                    id = 0,
                    userId = uid,
                    category = generated.category ?: "",
                    imageUrl = generated.imageUrl ?: "",
                    ingredients = generated.ingredients ?: emptyList(),
                    instructions = generated.instructions ?: emptyList(),
                    minutes = generated.minutes ?: 0,
                    stars = generated.stars ?: 0,
                    title = generated.title ?: ""
                )
                // Guardar en el backend
                recipeService.saveGeneratedRecipe(recipe = recipe)
                // Volver a cargar las recetas del backend para refrescar "Tus recetas recientes"
                getRecipes()
            } catch (e: Exception){
                println("Error al guardar receta: $e")
            }
        }
    }
}