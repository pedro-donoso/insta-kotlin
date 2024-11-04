package com.example.instagramproject.profile.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.instagramproject.profile.Story


@Composable
fun ProfileStory(
    stories: List<Story>,
    modifier: Modifier = Modifier
) {
    LazyRow(modifier = modifier) {
        items(stories) { story ->
            StoryItem(story)
        }
    }
}

@Composable
private fun StoryItem(
    story: Story,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(end = 16.dp)
            .width(60.dp),
        horizontalAlignment = CenterHorizontally
    ) {
        AsyncImage(
            model = story.image,
            contentDescription = "story image",
            modifier = Modifier.clip(CircleShape)
        )
        Text(text = story.text)
    }
}




@Preview(showBackground = true)
@Composable
fun ProfileStoryPreview() {
    ProfileStory(emptyList())
}
