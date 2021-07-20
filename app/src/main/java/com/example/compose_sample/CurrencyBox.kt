package com.example.compose_sample

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CurrencyBox(painter: Painter, currencyName: String, textColor: Color = Color.Black) {
    Card(
        elevation = 6.dp,
        modifier = Modifier
            .fillMaxWidth()
            .height(160.dp)
            .padding(top = 2.dp),
        border = BorderStroke(
            0.2.dp,
            Color.LightGray
        )
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painter,
                contentDescription = "icon",
                Modifier
                    .height(200.dp)
                    .width(120.dp)
                    .padding(start = 12.dp, end = 12.dp)
            )
            Text(
                text = currencyName,
                textAlign = TextAlign.Center,
                color = Color.LightGray,
                fontSize = 30.sp
            )
            Text(
                text = "1",
                modifier = Modifier
                    .background(Color.Transparent)
                    .padding(end = 24.dp)
                    .weight(1f),
                style = TextStyle(fontSize = 42.sp, color = textColor),
                textAlign = TextAlign.End,
                )
            //Column gravity or TextField gravity ?
            /*TextField(
                value = "1",
                onValueChange = {  },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                modifier = Modifier.background(Color.White).padding(start = 100.dp),
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                    textColor = Color.Black,
                ),
                textStyle = TextStyle(fontSize = 42.sp),
            )*/
        }
    }
}
