package com.example.instagramproject.profile

data class User(
    val username: String,
    val profileImageUrl: String,
    val posts: Int,
    val followers: Int,
    val following: Int,
    val name: String,
    val description: String,
    val stories: List<Story>
)

data class Story(
    val image: String,
    val text: String
)