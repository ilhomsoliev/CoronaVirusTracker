package com.ilhomsoliev.coronavirustracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ilhomsoliev.coronavirustracker.presentation.component.BlockTwoTexts
import com.ilhomsoliev.coronavirustracker.ui.theme.CoronaVirusTrackerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoronaVirusTrackerTheme {
                    BlockTwoTexts()
                    BlockTwoTexts()
                    BlockTwoTexts()
            }
        }
    }
}