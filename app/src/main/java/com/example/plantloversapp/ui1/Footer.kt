package com.example.plantloversapp.ui1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Footer() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFFC1CC))
            .padding(16.dp)
    ){
        Text(
            text ="Links:",
            style = MaterialTheme.typography.titleMedium

        )
        Text(text = "Portfolio: https://patriciageadev.vercel.app/")
        Text(text = "App done by Patricia Gea",
            style = MaterialTheme.typography.labelMedium
        )
    }
}