package screens

import androidx.compose.runtime.Composable
import auth.components.LoginForm
import shared.components.AppLayout

@Composable
fun LoginScreen() {
    AppLayout {
        LoginForm()
    }
}

