package com.lara.myapplication.domain.usecase

import com.lara.myapplication.domain.model.HomeContent
import com.lara.myapplication.domain.repository.HomeContentRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetHomeContentUseCase(
    private val homeContentRepository: HomeContentRepository
) {
    operator fun invoke(): Flow<HomeContent> = flow {
        emit(homeContentRepository.getHomeContent())
    }
}