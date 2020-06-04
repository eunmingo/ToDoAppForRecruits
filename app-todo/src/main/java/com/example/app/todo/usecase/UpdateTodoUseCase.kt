package com.example.app.todo.usecase

import com.example.modules.cores.gateways.TodoGateway
import com.example.modules.cores.models.Todo

interface UpdateTodoUseCase {
    suspend fun execute(todo: Todo)
}

class UpdateTodoUseCaseImpl(private val gateway: TodoGateway): UpdateTodoUseCase {
    override suspend fun execute(todo: Todo) = gateway.update(todo)
}