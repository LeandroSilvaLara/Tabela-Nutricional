package com.lara.myapplication.ui.screen.home

import com.lara.myapplication.domain.model.HomeContent

data class HomeUIState(
    val isLoading: Boolean = false,
    val homeContent: HomeContent? = null,
    val userName: String? = null,
)