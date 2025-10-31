package com.lara.myapplication.core.di

import com.lara.myapplication.data.datasource.local.HealthyRecipeLocalDataSource
import com.lara.myapplication.data.datasource.local.MockHealthyRecipeLocalDataSourceImpl
import com.lara.myapplication.data.datasource.local.MockWellnessNewsLocalDataSourceImpl
import com.lara.myapplication.data.datasource.local.WellnessNewsLocalDataSource
import com.lara.myapplication.data.repository.HealthyRecipeRepositoryImpl
import com.lara.myapplication.data.repository.HomeContentRepositoryImpl
import com.lara.myapplication.domain.repository.HealthyRecipeRepository
import com.lara.myapplication.domain.repository.HomeContentRepository
import com.lara.myapplication.domain.usecase.GetHealthyRecipeByIdUseCase
import com.lara.myapplication.domain.usecase.GetHomeContentUseCase
import com.lara.myapplication.domain.usecase.IsHealthyRecipeFavoriteUseCase
import com.lara.myapplication.domain.usecase.UpdateHealthyRecipeIsFavoriteUseCase
import com.lara.myapplication.ui.screen.healthy_recipe_details.HealthyRecipeDetailsViewModel
import com.lara.myapplication.ui.screen.home.HomeViewModel
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

object AppModules {

    val uiModule = module {
        viewModelOf(::HomeViewModel)
        viewModelOf(::HealthyRecipeDetailsViewModel)
    }

    val domainModule = module {
        factory { GetHomeContentUseCase(get()) }
        factory { GetHealthyRecipeByIdUseCase(get()) }
        factory { IsHealthyRecipeFavoriteUseCase(get()) }
        factory { UpdateHealthyRecipeIsFavoriteUseCase(get()) }
    }

    val dataModule = module {
        singleOf(::MockWellnessNewsLocalDataSourceImpl) {
            bind<WellnessNewsLocalDataSource>()
        }

        singleOf(::MockHealthyRecipeLocalDataSourceImpl) {
            bind<HealthyRecipeLocalDataSource>()
        }

        singleOf(::HomeContentRepositoryImpl) {
            bind<HomeContentRepository>()
        }

        singleOf(::HealthyRecipeRepositoryImpl) {
            bind<HealthyRecipeRepository>()
        }
    }
}