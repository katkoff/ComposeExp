package com.katkoff.composeexp

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            SetMainContent()
        }
    }

    @Preview
    @Composable
    private fun SetMainContent() {
        LazyColumn(
            modifier = Modifier
                .background(color = Color.White) // TODO: 22.02.2021 Dark theme support
                .fillMaxSize(),
        ) {
            item {
                Image(
                    painter = painterResource(id = R.drawable.clean_architecture),
                    contentDescription = null,
                    modifier = Modifier.height(300.dp)
                )
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(
                        text = "Clean Architecture",
                        style = TextStyle(
                            fontSize = 26.sp,
                        )
                    )
                    Spacer(modifier = Modifier.padding(8.dp))
                    Text(
                        text = "By Bob Martin",
                        style = TextStyle(
                            fontSize = 18.sp,
                        )
                    )
                    Spacer(modifier = Modifier.padding(8.dp))
                    Text(
                        text = "By applying universal rules of software architecture, you can dramatically improve developer productivity throughout the life of any software system.",
                        style = TextStyle(
                            color = Color.DarkGray,
                            fontSize = 18.sp,
                        )
                    )
                }
            }
        }
    }
}


