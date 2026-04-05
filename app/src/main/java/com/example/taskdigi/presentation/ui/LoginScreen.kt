import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Composable
fun LoginScreen(navController: NavController) {

    var username by remember { mutableStateOf("") }

    Column {
        TextField(value = username, onValueChange = { username = it })

        Button(onClick = {
            navController.navigate("list/$username")
        }) {
            Text("Login")
        }
    }
}