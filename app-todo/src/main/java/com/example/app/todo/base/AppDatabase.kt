package com.example.app.todo.base

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.modules.externals.db.todo.TodoDao
import com.example.modules.externals.db.todo.TodoEntity

@Database(entities = [TodoEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun todoDao(): TodoDao
}

