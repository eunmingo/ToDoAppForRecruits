package com.example.app.todo.usecase

import com.example.modules.cores.gateways.TodoGateway
import com.example.modules.cores.models.Todo

interface GetTodoUseCase {
    suspend fun execute(id: Long): Todo
}

class GetTodoUseCaseImpl(private val gateway: TodoGateway): GetTodoUseCase {
    override suspend fun execute(id: Long): Todo = gateway.get(id)
}