package com.example.app.todo.ui.main.adapter

import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField

class TodoItemViewModel {
    val title: ObservableField<String> = ObservableField("")
    val isCompleted: ObservableBoolean = ObservableBoolean(false)
}