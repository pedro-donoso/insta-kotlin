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
import com.example.instagramproject.profile.components.ProfileStory

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
        stories = createStories() // Llama a la función para crear historias
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 30.dp)
    ) {
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
        ProfileStory(
            stories = user.stories,
            modifier = Modifier.padding(start = 8.dp, end = 8.dp, top = 8.dp)
        )
    }
}

// Función para crear historias usando forEach
fun createStories(): List<Story> {
    val storyUrls = listOf(
        "https://randomuser.me/api/portraits/men/2.jpg",
        "https://randomuser.me/api/portraits/men/3.jpg",
        "https://randomuser.me/api/portraits/men/4.jpg",
        "https://randomuser.me/api/portraits/men/5.jpg",
        "https://randomuser.me/api/portraits/men/6.jpg",
        "https://randomuser.me/api/portraits/men/7.jpg",
        "https://randomuser.me/api/portraits/men/8.jpg",
        "https://randomuser.me/api/portraits/men/9.jpg"
    )

    val stories = mutableListOf<Story>()

    storyUrls.forEachIndexed { index, url ->
        stories.add(Story(url, "Story ${index + 1}"))
    }

    return stories
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}