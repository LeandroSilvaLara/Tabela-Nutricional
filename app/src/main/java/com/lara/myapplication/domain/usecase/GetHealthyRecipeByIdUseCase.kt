package com.lara.myapplication.domain.usecase

import com.lara.myapplication.data.model.HealthyRecipe
import com.lara.myapplication.domain.repository.HealthyRecipeRepository

class GetHealthyRecipeByIdUseCase(
    private val repository: HealthyRecipeRepository
) {

    suspend operator fun invoke(id: String): HealthyRecipe? = repository.getHealthyRecipeById(id)
}