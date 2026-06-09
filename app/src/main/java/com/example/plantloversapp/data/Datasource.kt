package com.example.plantloversapp.data

import com.example.plantloversapp.R
import com.example.plantloversapp.model.Plant

object Datasource {
    fun loadPlants(): List<Plant>{
        return listOf(
            Plant(
                "Monstera",
                "Tropical plant very popular.",
                R.drawable.monstera,
                category = "Indoor"
            ),
            Plant(
                "Cactus",
                "Needs just lit bit of water.",
                R.drawable.cactus,
                category = "Cactus"
            ),
            Plant(
                "Fern",
                "Loves wet enviroment.",
                R.drawable.fern,
                category = "Outdoor"
            ),
            Plant(
                "Orchid",
                "Elegant flowers.",
                R.drawable.orchid,
                category = "Flowers"
            )
            
        )
    }


}