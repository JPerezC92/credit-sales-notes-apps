package auth.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import creditsalesnotes.composeapp.generated.resources.Login_amico
import creditsalesnotes.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.painterResource


@Composable
fun LoginForm() {
    val email = rememberSaveable { mutableStateOf("") }
    val password = rememberSaveable { mutableStateOf("") }

    Column(
        modifier = Modifier.width(IntrinsicSize.Max)
    ) {


        Image(
            painter = painterResource(Res.drawable.Login_amico),
            contentDescription = null,
            modifier = Modifier.widthIn(200.dp, 250.dp).height(IntrinsicSize.Max)
                .align(Alignment.CenterHorizontally)
        )


        Text(
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp),
            fontSize = 24.sp,
            text = "Inicia sesión",
        )

        Text(
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp),
            color = Color.Gray,
            fontSize = 16.sp,
            text = "Ingresa a tu cuenta",
        )

        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.widthIn(350.dp, 350.dp).fillMaxWidth()
        ) {

            OutlinedTextField(
//                placeholder = { Text("Email") },
                modifier = Modifier.fillMaxWidth(),
                singleLine = true,
                label = { Text("Correo") },
                value = email.value,
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
                onValueChange = { email.value = it })

            OutlinedTextField(
//                placeholder = { Text("Password") },
                modifier = Modifier.fillMaxWidth(),
                singleLine = true,
                label = { Text("Contraseña") },
                value = password.value,
                onValueChange = { password.value = it })
        }

        Button(modifier = Modifier.fillMaxWidth().padding(top = 16.dp).height(IntrinsicSize.Max),
            onClick = {
                println("Login clicked")
            }) {
            Text(fontSize = 16.sp, text = "Entrar")
        }

        Divider(
            color = Color.LightGray, modifier = Modifier.fillMaxWidth().padding(vertical = 16.dp)
        )

//        Text(
//            textAlign = TextAlign.Center,
//            modifier = Modifier.align(Alignment.CenterHorizontally).padding(top = 16.dp).clickable(
//                indication = null,
//                interactionSource = remember { MutableInteractionSource() },
//                onClick = {
//                    println("Register clicked")
//                }),
//            fontSize = 16.sp,
//            text = "¿No tienes una cuenta?"
//        )

        Box(modifier = Modifier.align(Alignment.CenterHorizontally)//.border(1.dp, Color.Red)
            .clip(RoundedCornerShape(45)).clickable(indication = rememberRipple(
                bounded = true, color = Color.Cyan
            ), interactionSource = remember { MutableInteractionSource() }, onClick = {
                println("Register clicked")
            })

        ) {
            Text(
                textAlign = TextAlign.Center,
                modifier = Modifier.height(IntrinsicSize.Max).width(IntrinsicSize.Max)
                    .padding(16.dp),
                text = "¿No tienes una cuenta?",
                style = TextStyle(
                    lineHeight = 4.5.sp,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Black,
                )
            )
        }

        Box(modifier = Modifier.align(Alignment.CenterHorizontally) //.border(1.dp, Color.Red)
            .clip(RoundedCornerShape(45)).clickable(indication = rememberRipple(
                bounded = true, radius = 250.dp, color = Color.Cyan
            ), interactionSource = remember { MutableInteractionSource() }, onClick = {
                println("Register clicked")
            })
        ) {
            Text(
                textAlign = TextAlign.Center, modifier = Modifier.padding(16.dp).drawBehind {
                    val verticalOffset = size.height - 2.sp.toPx()
                    drawLine(
                        color = Color.LightGray,
                        strokeWidth = 1.dp.toPx(),
                        start = Offset(0f, verticalOffset),
                        end = Offset(size.width, verticalOffset)
                    )
                }, text = "Registrarse", style = TextStyle(
                    lineHeight = 4.5.sp,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Black,
                )
            )
        }
    }
}