package com.example.modules.externals.db.todo

import androidx.room.*

@Dao
interface TodoDao {
    @Query("SELECT * FROM T_TODO")
    suspend fun get(): List<TodoEntity>

    @Query("SELECT * FROM T_TODO WHERE id = :id")
    suspend fun get(id: Long): TodoEntity

    @Insert
    suspend fun insert(todo: TodoEntity)

    @Update
    suspend fun update(todo: TodoEntity)

    @Delete
    suspend fun delete(todo: TodoEntity)
}