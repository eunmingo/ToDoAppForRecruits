package com.example.app.todo.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.modules.cores.models.Todo

class MainViewModel : ViewModel() {
    val list = MutableLiveData(mutableListOf<Todo>(
        Todo(1, "Title", "Content", false),
        Todo(2, "Title", "Content", true),
        Todo(3, "Title", "Content", true),
        Todo(4, "Title", "Content", false)
    ))
}