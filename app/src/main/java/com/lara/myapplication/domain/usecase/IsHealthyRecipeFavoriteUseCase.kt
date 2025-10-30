package com.lara.myapplication.domain.usecase

import com.lara.myapplication.domain.repository.HealthyRecipeRepository

class IsHealthyRecipeFavoriteUseCase(
    private val repository: HealthyRecipeRepository
) {
    suspend operator fun invoke(id: String): Boolean = repository.checkIsFavorite(id)
}