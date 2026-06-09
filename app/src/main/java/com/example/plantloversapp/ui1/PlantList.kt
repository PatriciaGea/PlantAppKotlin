import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.plantloversapp.data.Datasource
import com.example.plantloversapp.model.Plant

@Composable
fun PlantList(filteredPlants: List<Plant>) {
    val plants = Datasource.loadPlants()

    LazyColumn (contentPadding = PaddingValues(bottom = 110.dp)){
        items(plants) { plant ->
            PlantCard(
                plant = plant
            )
        }
    }
}
@Composable
fun CategoryRow(onCategorySelected: (String) -> Unit) {
    val categories =listOf(
        "All",
        "Indoor",
        "Outdoor",
        "Flowers",
        "Cactus"
    )
    LazyRow {
        items(categories) { category ->
            AssistChip(
                onClick = {onCategorySelected(category)},
                label = {
                    Text(category)
                },
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}