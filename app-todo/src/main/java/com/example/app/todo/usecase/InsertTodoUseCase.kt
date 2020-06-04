package com.example.app.todo.usecase

import com.example.modules.cores.gateways.TodoGateway
import com.example.modules.cores.models.Todo

interface InsertTodoUseCase {
    suspend fun execute(todo: Todo)
}

class InsertTodoUseCaseImpl(private val gateway: TodoGateway): InsertTodoUseCase {
    override suspend fun execute(todo: Todo) = gateway.insert(todo)

}