package screens

import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import routes.Routes
import shared.components.AppLayout

@Composable
fun HomeScreen(
    navController: NavHostController
) {
    AppLayout() {

        Text("Home")

        Button(
            onClick = { navController.navigate(Routes.Auth.Login.path) },
            modifier = Modifier.requiredHeight(IntrinsicSize.Min)
        ) {
            Text("Go to login")
        }
    }
}