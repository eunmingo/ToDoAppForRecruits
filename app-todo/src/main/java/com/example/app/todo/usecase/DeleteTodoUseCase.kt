package com.example.app.todo.usecase

import com.example.modules.cores.gateways.TodoGateway
import com.example.modules.cores.models.Todo

interface DeleteTodoUseCase {
    suspend fun execute(todo: Todo)
}

class DeleteTodoUseCaseImpl(private val gateway: TodoGateway): DeleteTodoUseCase {
    override suspend fun execute(todo: Todo) = gateway.delete(todo)
}