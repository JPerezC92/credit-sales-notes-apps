import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import org.jetbrains.compose.ui.tooling.preview.Preview
import routes.AppRouter

@Composable
@Preview
fun App() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }


        AppRouter()


//        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
//            Button(onClick = { showContent = !showContent }) {
//                Text("Click me!")
//            }
//
//            AnimatedVisibility(showContent) {
//                val greeting = remember { Greeting().greet() }
//                Column(
//                    Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
//                ) {
//                    Image(painterResource(Res.drawable.compose_multiplatform), null)
//                    Text("Loading")
//                    Text("Compose: $greeting")
//                }
//            }
//        }
    }
}