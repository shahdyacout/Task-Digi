import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            val navController = rememberNavController()

            NavHost(navController, startDestination = "login") {

                composable("login") {
                    LoginScreen(navController)
                }

                composable("list/{username}") {
                    val username = it.arguments?.getString("username") ?: ""

                    ListScreen(username)
                }
            }
        }
    }
}