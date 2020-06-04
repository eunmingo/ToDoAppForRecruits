package com.example.modules.externals.db.todo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "t_todo")
data class TodoEntity (
    @PrimaryKey(autoGenerate = true) val id: Long?,
    val title: String,
    val content: String,
    val isCompleted: Boolean
)