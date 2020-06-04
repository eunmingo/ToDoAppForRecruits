package com.example.app.todo.di

import androidx.room.Room
import com.example.app.todo.base.AppDatabase
import com.example.app.todo.usecase.*
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.bind
import org.koin.dsl.module

val koinModules = module {
    single { Room.databaseBuilder(androidContext(), AppDatabase::class.java, "todo.db").build() }

    factory { get<AppDatabase>().todoDao() }

    factory { GetTodoListUseCaseImpl(get()) } bind GetTodoListUseCase::class
    factory { GetTodoUseCaseImpl(get()) } bind GetTodoUseCase::class
    factory { InsertTodoUseCaseImpl(get()) } bind InsertTodoUseCase::class
    factory { UpdateTodoUseCaseImpl(get()) } bind UpdateTodoUseCase::class
    factory { DeleteTodoUseCaseImpl(get()) } bind DeleteTodoUseCase::class
}