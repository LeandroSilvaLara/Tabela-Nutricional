package com.lara.myapplication.domain.repository

import com.lara.myapplication.domain.model.HomeContent

interface HomeContentRepository {
    suspend fun getHomeContent(): HomeContent
}