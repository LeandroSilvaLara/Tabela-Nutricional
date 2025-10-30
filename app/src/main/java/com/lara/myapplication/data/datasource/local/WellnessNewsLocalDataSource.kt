package com.lara.myapplication.data.datasource.local

import com.lara.myapplication.data.model.WellnessNews

interface WellnessNewsLocalDataSource {
    suspend fun getAllWellnessNews(): List<WellnessNews>
}