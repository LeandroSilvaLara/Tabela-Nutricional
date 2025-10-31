package com.lara.myapplication.ui.screen.home

sealed interface HomeEvent {
    data object OnInit: HomeEvent
}