package com.lara.myapplication.ui.screen.healthy_recipe_details

import com.lara.myapplication.data.model.HealthyRecipe

data class HealthyRecipeDetailsUIState(
    val isLoading: Boolean = false,
    val healthyRecipe: HealthyRecipe? = null,
    val isFavorite: Boolean = false,
)
