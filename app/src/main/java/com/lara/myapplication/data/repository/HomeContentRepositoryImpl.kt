package com.lara.myapplication.data.repository

import com.lara.myapplication.data.datasource.local.HealthyRecipeLocalDataSource
import com.lara.myapplication.data.datasource.local.WellnessNewsLocalDataSource
import com.lara.myapplication.domain.model.HomeContent
import com.lara.myapplication.domain.repository.HomeContentRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext


class HomeContentRepositoryImpl(
    private val healthyRecipeLocalDataSource: HealthyRecipeLocalDataSource,
    private val wellnessNewsLocalDataSource: WellnessNewsLocalDataSource
): HomeContentRepository {
    override suspend fun getHomeContent(): HomeContent = withContext(Dispatchers.Default) {
        val wellnessNewsList = wellnessNewsLocalDataSource.getAllWellnessNews()
        val healthyRecipeList = healthyRecipeLocalDataSource.getAllHealthyRecipes()

        delay(1_000)

        return@withContext HomeContent(
            wellnessNewsList = wellnessNewsList,
            healthyRecipeList = healthyRecipeList
        )
    }
}
