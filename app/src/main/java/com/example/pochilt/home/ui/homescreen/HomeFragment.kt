package com.example.pochilt.home.ui.homescreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {
    private val viewModel: HomeViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                Container()
                MoviesList(movies = listOf(
                    "Jorge",
                    "Dullius",
                    "Android",
                    "Developer",
                    "At",
                    "Jera"
                ))
            }
        }
    }

    @Composable
    fun Container() {
        Text("Hello Santos")
    }

    @Composable
    @Preview
    fun HomePreview() {
        Container()
    }
}