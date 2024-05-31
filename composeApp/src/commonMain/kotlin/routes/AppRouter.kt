package routes

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import screens.HomeScreen


@Composable
fun AppRouter() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.Home.path,
    ) {

        composable(Routes.Home.path) {
            HomeScreen(navController)
        }

        authRouter(navController)
    }

}
