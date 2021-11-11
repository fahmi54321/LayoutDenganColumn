package com.android.layoutdengancolumn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.layoutdengancolumn.ui.theme.LayoutDenganColumnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Composable
fun ItemScreen() {

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier
                .background(Color.Magenta)
                .fillMaxWidth()
                .height(300.dp)
        ) {

        }

        OutlinedTextField(
            value = "0",
            onValueChange = {},
            modifier = Modifier
                .padding(6.dp)
        )

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(6.dp)) {
            Text(text = "Naik")
        }
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(4.dp)) {
            Text(text = "Naik")
        }
    }
}

@Preview
@Composable
fun PreviewItemScreen() {
    ItemScreen()
}