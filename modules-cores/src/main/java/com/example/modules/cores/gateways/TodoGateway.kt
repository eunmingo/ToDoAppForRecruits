package com.example.modules.cores.gateways

import com.example.modules.cores.common.DB_NULL_DATA
import com.example.modules.cores.models.Todo
import com.example.modules.externals.db.todo.TodoDao
import com.example.modules.externals.db.todo.TodoEntity

interface TodoGateway {
    suspend fun get(): List<Todo>
    suspend fun get(id: Long): Todo
    suspend fun insert(todo: Todo)
    suspend fun update(todo: Todo)
    suspend fun delete(todo: Todo)
}

class TodoGatewayImpl(private val todoDao: TodoDao): TodoGateway {
    override suspend fun get(): List<Todo> = todoDao.get().map(::toCore)

    override suspend fun get(id: Long): Todo = toCore(todoDao.get(id))

    override suspend fun insert(todo: Todo) = todoDao.insert(todo.toEntity())

    override suspend fun update(todo: Todo) = todoDao.update(todo.toEntity())

    override suspend fun delete(todo: Todo) = todoDao.delete(todo.toEntity())

    private fun toCore(todo: TodoEntity) = Todo(id = todo.id?: DB_NULL_DATA, title = todo.title, content = todo.content, isCompleted = todo.isCompleted)

    private fun Todo.toEntity() = TodoEntity(id = if (id == DB_NULL_DATA) null else id, title = title, content = content, isCompleted = isCompleted)


}
