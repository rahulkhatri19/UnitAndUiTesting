package com.geekforgeek.unitanduitesting

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen(loginInterface: LoginInterface) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxHeight()
    ) {

        var inputEmail by remember { mutableStateOf(TextFieldValue("")) }
        var inputPassword by remember { mutableStateOf(TextFieldValue("")) }
        var buttonClick by remember { mutableStateOf(false) }

        Spacer(Modifier.height(120.dp))

        OutlinedTextField(
            value = inputEmail,
            onValueChange = {
                inputEmail = it
            },
            label = {
                Text(
                    text = "Email"
                )
            },
            placeholder = {
                Text(
                    text = "Email"
                )
            },

            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = inputPassword,
            onValueChange = {
                inputPassword = it
            },
            label = {
                Text(
                    text = "Password"
                )
            },
            placeholder = {
                Text(
                    text = "Password"
                )
            },

            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp)
        )

        Button(
            onClick = {
                buttonClick = true
                loginInterface.onClick()
            },
            Modifier
                .fillMaxWidth()
                .padding(top = 12.dp)
        ) {
            Text("Login")
        }

        if (buttonClick) {
            Text(
                "Button Clicked !",
                Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp)
            )
        }

    }
}

interface LoginInterface {
    fun onClick()
}







