package com.lara.myapplication.domain.usecase

import com.lara.myapplication.domain.repository.HealthyRecipeRepository

class UpdateHealthyRecipeIsFavoriteUseCase(
    private val repository: HealthyRecipeRepository
) {

    suspend operator fun invoke(id: String, isFavorite: Boolean) {
        repository.updateIsFavorite(id, isFavorite)
    }
}