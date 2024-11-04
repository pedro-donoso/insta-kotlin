package com.example.instagramproject.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagramproject.profile.components.ProfileDescription
import com.example.instagramproject.profile.components.ProfileHeader
import com.example.instagramproject.profile.components.ProfileInformation

@Composable
fun ProfileScreen() {

    val user = User(
        username = "odikil999",
        profileImageUrl = "https://randomuser.me/api/portraits/men/1.jpg",
        posts = 15,
        followers = 388,
        following = 360,
        name = "Pedro",
        description = "Mi gran descripción"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 30.dp)
    ){
        ProfileHeader(
            backClick = {},
            notificationClick = {},
            optionsClick = {}
        )
        ProfileInformation()
        ProfileDescription(
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 4.dp, bottom = 4.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}