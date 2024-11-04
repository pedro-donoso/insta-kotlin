package com.example.instagramproject.profile.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ProfileAction(
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier.fillMaxWidth()) {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Seguir")
            }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Mensaje")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileActionPreview() {
    ProfileAction()
}