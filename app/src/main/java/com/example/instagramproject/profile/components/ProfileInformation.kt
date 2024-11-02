package com.example.instagramproject.profile.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ProfileInformation(
    modifier: Modifier = Modifier
) {
    Row (modifier = modifier) {
        ProfileInformationItem(15, "Publicaciones")
        ProfileInformationItem(388, "Seguidores")
        ProfileInformationItem(360, "Seguidos")
    }
}

@Composable
private fun ProfileInformationItem(
    amount: Int,
    type: String,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(text = amount.toString())
        Text(text = type)
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileInformationPreview() {
    ProfileInformation()
}


