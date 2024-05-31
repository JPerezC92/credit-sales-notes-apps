package routes

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import screens.LoginScreen


fun NavGraphBuilder.authRouter(navController: NavController) {

    navigation(startDestination = Routes.Auth.Login.path, route = Routes.Auth.Root.path) {
        composable(Routes.Auth.Login.path) {
            LoginScreen()
        }
    }
}