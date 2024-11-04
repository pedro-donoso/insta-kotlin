package com.example.instagramproject.profile.components

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ProfileStory(
    modifier: Modifier = Modifier
) {
    LazyRow(modifier = modifier) {

    }
}

@Preview(showBackground = true)
@Composable
fun ProfileStoryPreview() {
    ProfileStory()
}
