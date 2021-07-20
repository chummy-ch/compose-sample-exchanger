package com.example.compose_sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose_sample.ui.theme.ComposesampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposesampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    MainScreen()

                }
            }
        }
    }
}

@Composable
@Preview
fun MainScreen() {
    Column {
        val uahIcon = painterResource(id = R.drawable.ic_ukraine)
        CurrencyBox(uahIcon, "UAH", Color.Red)

        val usdIcon = painterResource(id = R.drawable.ic_united_states)
        CurrencyBox(painter = usdIcon, currencyName = "USD")

        Keyboard()
    }

}
