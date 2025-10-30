package com.lara.myapplication.data.datasource.local

import com.lara.myapplication.data.model.mock.mockWellnessNews

class MockWellnessNewsLocalDataSourceImpl: WellnessNewsLocalDataSource {
    override suspend fun  getAllWellnessNews() = mockWellnessNews
}