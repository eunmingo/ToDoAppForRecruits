package com.example.modules.cores.models

data class Todo (
    val id: Long = -1,
    val title: String,
    val content: String,
    val isCompleted: Boolean
)
