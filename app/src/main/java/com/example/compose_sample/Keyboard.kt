package com.example.compose_sample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val firstRow = listOf("⤈", " ", "%", "÷")
val secondRow = listOf("1", "2", "3", "x")
val thirdRow = listOf("4", "5", "6", "-")
val fourthRow = listOf("7", "8", "9", "+")

@Composable
fun BoxButton(text: String, modifier: Modifier) {
    Button(
        onClick = { /*TODO*/ },
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent)
    ) {
        Text(text = text, style = TextStyle(fontSize = 42.sp))
    }
}

@Composable
fun Keyboard() {
    Column(
        modifier = Modifier.fillMaxHeight(),
        //verticalArrangement = Arrangement.SpaceEvenly
    ) {
        val buttonModified = Modifier.weight(0.25f)
        val rowModifier = Modifier.height(IntrinsicSize.Max).weight(0.25f)
        val horizontalArrangement = Arrangement.SpaceEvenly

        Row(modifier = rowModifier) {
            firstRow.forEach { text ->
                BoxButton(text = text, modifier = buttonModified)
            }
        }

        Row(modifier = rowModifier) {
            secondRow.forEach { text ->
                BoxButton(text = text, modifier = buttonModified)
            }
        }

        Row(modifier = rowModifier) {
            thirdRow.forEach { text ->
                BoxButton(text = text, modifier = buttonModified)
            }
        }

        Row(modifier = rowModifier) {
            fourthRow.forEach { text ->
                BoxButton(text = text, modifier = buttonModified)
            }
        }
    }
}


/*
@Composable
fun Keyboard() {
    Column(modifier = Modifier.height(IntrinsicSize.Min)) {
        val buttonModified = Modifier.weight(0.25f)
        Row(modifier = Modifier.height(IntrinsicSize.Min)) {

            BoxButton(text = "⤈", modifier = buttonModified)
            BoxButton(text = "", modifier = buttonModified)
            BoxButton(text = "%", modifier = buttonModified)
            BoxButton(text = "÷", modifier = buttonModified)
        }

        Row(modifier = Modifier.height(IntrinsicSize.Min)) {

            BoxButton(text = "1", modifier = buttonModified)
            BoxButton(text = "2", modifier = buttonModified)
            BoxButton(text = "3", modifier = buttonModified)
            BoxButton(text = "x", modifier = buttonModified)
        }

        Row(modifier = Modifier.height(IntrinsicSize.Min)) {

            BoxButton(text = "4", modifier = buttonModified)
            BoxButton(text = "5", modifier = buttonModified)
            BoxButton(text = "6", modifier = buttonModified)
            BoxButton(text = "-", modifier = buttonModified)
        }

        Row(modifier = Modifier.height(IntrinsicSize.Min)) {

            BoxButton(text = "7", modifier = buttonModified)
            BoxButton(text = "8", modifier = buttonModified)
            BoxButton(text = "9", modifier = buttonModified)
            BoxButton(text = "+", modifier = buttonModified)
        }

        Row(modifier = Modifier.height(IntrinsicSize.Min)) {

            BoxButton(text = ",", modifier = buttonModified)
            BoxButton(text = "0", modifier = buttonModified)
            BoxButton(text = "C", modifier = buttonModified)
            BoxButton(text = "=", modifier = buttonModified)
        }
    }
}*/
