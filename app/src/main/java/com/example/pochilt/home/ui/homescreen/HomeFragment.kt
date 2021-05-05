package com.example.pochilt.home.ui.homescreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import com.example.pochilt.commonui.theme.PocHiltTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {
//    private val viewModel: HomeViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return ComposeView(requireContext()).apply {
            setContent {
                PocHiltTheme {
                    Text("Roi Jorge", color = Color.Blue)
                }
            }
        }
    }

//    @Composable
//    fun Container() {
//        Column {
////            Text("Hello Dullius")
//            MoviesList(
//                movies = listOf(
//                    "Jorge",
//                    "Dullius",
//                    "Android",
//                    "Developer",
//                    "At",
//                    "Jera"
//                )
//            )
//        }
//    }
//
//    @Composable
//    @Preview
//    fun HomePreview() {
//        Container()
//    }
}