package com.katkoff.composeexp

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
                .background(color = Color.White)
                .fillMaxSize(),
        ) {
            item {
                Image(
                    painter = painterResource(id = R.drawable.naboo),
                    contentDescription = null,
                    modifier = Modifier
                        .height(300.dp)
                        .fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Naboo",
                            style = TextStyle(fontSize = 26.sp)
                        )
                        Text(
                            text = "planet",
                            style = TextStyle(fontSize = 16.sp),
                            modifier = Modifier.align(Alignment.CenterVertically)
                        )
                    }
                    Spacer(modifier = Modifier.padding(8.dp))
                    Text(
                        text = "An idyllic world close to the border of the Outer Rim Territories, Naboo is inhabited by peaceful humans known as the Naboo, and an indigenous species of intelligent amphibians called the Gungans. Naboo's surface consists of swampy lakes, rolling plains and green hills. Its population centers are beautiful -- Naboo's river cities are filled with classical architecture and greenery, while the underwater Gungan settlements are a beautiful display of exotic hydrostatic bubble technology.",
                        style = TextStyle(
                            color = Color.DarkGray,
                            fontSize = 18.sp,
                        )
                    )
                    Spacer(modifier = Modifier.padding(16.dp))
                    Button(
                        onClick = {},
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    ) {
                        Text(text = "Teleport")
                    }
                }
            }
        }
    }
}


