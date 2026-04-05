import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.taskdigi.presentation.viewmodel.ItemViewModel


@Composable
fun ListScreen(
    username: String,
    viewModel: ItemViewModel = hiltViewModel()
) {

    val items by viewModel.items.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF7F7F7))
            .padding(16.dp)
    ) {


        Text(
            text = "Welcome, $username ",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xF2343A3B)
        )

        Spacer(modifier = Modifier.height(20.dp))


        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(items) { item ->

                Card(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults.cardElevation(4.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .padding(16.dp)
                    ) {

                        Text(
                            text = item.title,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Black
                        )

                        Text(
                            text = "Item Describtion: ${item.description}",
                            fontSize = 14.sp,
                            color = Color.Gray,
                            modifier = Modifier.padding(top = 6.dp)
                        )
                    }
                }
            }
        }
    }
}