package com.example.instagramproject.profile.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ProfileDescription(
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxWidth()) {
        Text(text = "Pedro", fontWeight = FontWeight.Bold)
        Text(text = "Descripción")
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileDescriptionPreview() {
    ProfileDescription()
}