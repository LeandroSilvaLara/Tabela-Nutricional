package com.lara.myapplication.domain.model

import com.lara.myapplication.data.model.HealthyRecipe
import com.lara.myapplication.data.model.WellnessNews

data class HomeContent(
    val wellnessNewsList: List<WellnessNews>,
    val healthyRecipeList: List<HealthyRecipe>,
)