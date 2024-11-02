package com.example.instagramproject.profile

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.instagramproject.profile.components.ProfileHeader

@Composable
fun ProfileScreen() {
    ProfileHeader(
        backClick = {},
        notificationClick = {},
        optionsClick = {}
    )

}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}