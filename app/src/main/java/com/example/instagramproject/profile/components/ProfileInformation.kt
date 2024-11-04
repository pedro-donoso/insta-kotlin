package com.example.instagramproject.profile.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage

@Composable
fun ProfileInformation(
    imageUrl: String,
    posts: Int,
    followers: Int,
    following: Int,
    modifier: Modifier = Modifier
) {
    Row (
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        AsyncImage(
            model = imageUrl,
            contentDescription = "profile image",
            modifier = Modifier.clip(CircleShape)
        )
        ProfileInformationItem(posts, "Publicaciones")
        ProfileInformationItem(followers, "Seguidores")
        ProfileInformationItem(following, "Seguidos")
    }
}

@Composable
private fun ProfileInformationItem(
    amount: Int,
    type: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Text(
            text = amount.toString(),
            fontWeight = FontWeight.Bold
        )
        Text(text = type)
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileInformationPreview() {
    ProfileInformation("https://randomuser.me/api/portraits/men/1.jpg", 150, 150, 150)
}


