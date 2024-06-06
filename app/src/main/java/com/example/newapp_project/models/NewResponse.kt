package com.example.newapp_project.models

data class NewResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)