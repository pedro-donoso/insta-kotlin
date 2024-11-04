package com.example.instagramproject.profile.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ProfileDescription() {
    Column {
        Text(text = "Pedro", fontWeight = FontWeight.Bold)
        Text(text = "Description")
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileDescriptionPreview() {
    ProfileDescription()
}