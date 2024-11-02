package com.example.instagramproject.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.instagramproject.profile.components.ProfileHeader
import com.example.instagramproject.profile.components.ProfileInformation

@Composable
fun ProfileScreen() {

    Column{
        ProfileHeader(
            backClick = {},
            notificationClick = {},
            optionsClick = {}
        )
        ProfileInformation()
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}