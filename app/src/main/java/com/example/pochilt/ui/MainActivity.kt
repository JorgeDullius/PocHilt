package com.example.pochilt.ui

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import com.example.pochilt.R
import com.example.pochilt.databinding.ActivityMainBinding
import com.example.pochilt.ui.home.HomeScreen
import com.example.pochilt.ui.shared.theme.PocHiltTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PocHiltTheme {
                HomeScreen()
            }
        }
    }
}