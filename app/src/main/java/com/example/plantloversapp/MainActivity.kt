package com.example.plantloversapp

import CategoryRow
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import PlantCard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.plantloversapp.data.Datasource
import com.example.plantloversapp.ui.theme.PlantLoversAppTheme
import com.example.plantloversapp.ui1.Footer

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PlantLoversAppTheme {
                var selectedCategory by remember { mutableStateOf("All") }

                val allPlants = Datasource.loadPlants()

                val filteredPlants = if (selectedCategory == "All") {
                    allPlants
                } else {
                    allPlants.filter { it.category == selectedCategory }
                }

                LazyColumn {

                    item {
                        Spacer(modifier = Modifier.height(66.dp))
                    }

                    item {
                        Text(
                            text = "Plant Lovers",
                            style = MaterialTheme.typography.headlineLarge,
                            modifier = Modifier.padding(16.dp)
                        )
                    }

                    item {
                        CategoryRow(
                            onCategorySelected = { category ->
                                selectedCategory = category
                            }
                        )
                    }

                    items(filteredPlants) { plant ->
                        PlantCard(plant)
                    }

                    item {
                        Footer()
                    }

                    item {
                        Spacer(modifier = Modifier.height(66.dp))
                    }
                }
            }
        }
    }
}

