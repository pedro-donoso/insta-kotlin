package com.example.instagramproject.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagramproject.profile.components.ProfileAction
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
        description = "Mi gran descripción",
        stories = listOf(
            Story("https://randomuser.me/api/portraits/men/1.jpg", "Story 1"),
            Story("https://randomuser.me/api/portraits/men/2.jpg", "Story 2"),
            Story("https://randomuser.me/api/portraits/men/3.jpg", "Story 3"),
            Story("https://randomuser.me/api/portraits/men/4.jpg", "Story 4"),
            Story("https://randomuser.me/api/portraits/men/5.jpg", "Story 5"),
            Story("https://randomuser.me/api/portraits/men/6.jpg", "Story 6"),
            Story("https://randomuser.me/api/portraits/men/7.jpg", "Story 7"),
            Story("https://randomuser.me/api/portraits/men/8.jpg", "Story 8"),
            Story("https://randomuser.me/api/portraits/men/9.jpg", "Story 9"),
            Story("https://randomuser.me/api/portraits/men/10.jpg", "Story 10")
        )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 30.dp)
    ){
        ProfileHeader(
            backClick = {},
            notificationClick = {},
            optionsClick = {},
            username = user.username
        )
        ProfileInformation(
            imageUrl = user.profileImageUrl,
            posts = user.posts,
            followers = user.followers,
            following = user.following
        )
        ProfileDescription(
            name = user.name,
            description = user.description,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 4.dp, bottom = 4.dp)
        )
        ProfileAction(
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}