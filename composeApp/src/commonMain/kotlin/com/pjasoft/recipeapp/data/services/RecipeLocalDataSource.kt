package com.pjasoft.recipeapp.data.services

import com.pjasoft.recipeapp.domain.model.Recipe

class RecipeLocalDataSource {
    private val recipes = listOf(
        Recipe(
            id = "1",
            title = "Ensalada templada de pollo y quinoa baja en calorías",
            subtitle = "Ligera y saludable",
            imageUrl = "https://images.pexels.com/photos/1437267/pexels-photo-1437267.jpeg",
            category = "Mediterránea",
            timeMinutes = 25,
            difficulty = 1,
            ingredients = listOf(
                "Pechuga de pollo (120 g)",
                "Quinoa (40 g, cruda)",
                "Lechuga romana (2 tazas, troceada)",
                "Tomates cherry (8, cortados a la mitad)",
                "Pepino (1/2, en medias lunas)",
                "Cebolla morada (2 cucharadas, picada fina)",
                "Jugo de limón (1 cucharada)",
                "Aceite de oliva (1 cucharadita)",
                "Perejil fresco (1 cucharada, picado)",
                "Sal y pimienta al gusto"
            ),
            steps = listOf(
                "Cocer la quinoa según el paquete y dejar templar.",
                "Sazonar el pollo con sal y pimienta y dorar en una sartén.",
                "Cortar el pollo en tiras.",
                "Mezclar lechuga, pepino, tomates y cebolla en un bol grande.",
                "Añadir pollo y quinoa.",
                "Aliñar con limón, aceite, sal, pimienta y perejil.",
                "Mezclar suavemente y servir."
            ),
            isQuick = false,
            isRecent = true
        ),
        Recipe(
            id = "2",
            title = "Huevos revueltos a la mexicana con aguacate",
            subtitle = "Perfectos para el desayuno",
            imageUrl = "https://images.pexels.com/photos/793759/pexels-photo-793759.jpeg",
            category = "Mexicana",
            timeMinutes = 15,
            difficulty = 2,
            ingredients = listOf(
                "Huevos (2)",
                "Cebolla blanca (2 cucharadas, picada)",
                "Tomate (2 cucharadas, picado)",
                "Jalapeño (1 cucharadita, picado)",
                "Cilantro fresco (1 cucharada, picado)",
                "Mantequilla o aceite (1 cucharadita)",
                "Sal y pimienta al gusto",
                "Aguacate (1/2, en láminas)",
                "Tortillas de maíz o pan tostado"
            ),
            steps = listOf(
                "Picar cebolla, tomate y jalapeño.",
                "Sofreír la cebolla en una sartén con mantequilla/aceite.",
                "Añadir tomate y jalapeño, cocinar 2–3 minutos.",
                "Batir los huevos con sal y pimienta.",
                "Verter los huevos y remover hasta lograr textura cremosa.",
                "Agregar cilantro al final.",
                "Servir con aguacate y tortillas/pan."
            ),
            isQuick = true,
            isRecent = true
        ),
        Recipe(
            id = "3",
            title = "Tostadas rápidas de aguacate y huevo",
            subtitle = "Snack express",
            imageUrl = "https://images.pexels.com/photos/566566/pexels-photo-566566.jpeg",
            category = "Snack",
            timeMinutes = 10,
            difficulty = 1,
            ingredients = listOf(
                "Pan integral (2 rebanadas)",
                "Aguacate (1/2)",
                "Huevo cocido (1)",
                "Sal y pimienta",
                "Jugo de limón (opcional)"
            ),
            steps = listOf(
                "Tostar el pan.",
                "Aplastar el aguacate con sal, pimienta y limón.",
                "Untar el aguacate en las tostadas.",
                "Cortar el huevo en rodajas y colocarlo encima.",
                "Servir inmediatamente."
            ),
            isQuick = true,
            isRecent = false
        ),
        Recipe(
            id = "4",
            title = "Pasta cremosa de champiñones",
            subtitle = "Comfort food",
            imageUrl = "https://images.pexels.com/photos/1279330/pexels-photo-1279330.jpeg",
            category = "Italiana",
            timeMinutes = 30,
            difficulty = 3,
            ingredients = listOf(
                "Pasta (80 g)",
                "Champiñones (100 g, en láminas)",
                "Cebolla (1/4, picada)",
                "Ajo (1 diente, picado)",
                "Crema de leche ligera (60 ml)",
                "Aceite de oliva (1 cucharada)",
                "Queso rallado (opcional)",
                "Sal y pimienta"
            ),
            steps = listOf(
                "Cocer la pasta al dente.",
                "Sofreír cebolla y ajo en aceite de oliva.",
                "Añadir champiñones y cocinar hasta dorar.",
                "Agregar la crema y salpimentar.",
                "Mezclar la salsa con la pasta cocida.",
                "Servir con queso rallado si se desea."
            ),
            isQuick = false,
            isRecent = false
        )
    )

    fun getAll(): List<Recipe> = recipes
}