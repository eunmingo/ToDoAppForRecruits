package com.example.app.todo.ui.main.di

import com.example.app.todo.ui.main.MainViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModules = module {
    viewModel { MainViewModel() }
}