package com.lara.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.lara.myapplication.ui.screen.nav_host.MainNavHost
import com.lara.myapplication.ui.theme.TabelaNutricionalTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TabelaNutricionalTheme {
                MainNavHost()
            }
        }
    }
}
