package com.example.app.todo.usecase

import com.example.modules.cores.gateways.TodoGateway
import com.example.modules.cores.models.Todo

interface GetTodoListUseCase {
    suspend fun execute(): List<Todo>
}

class GetTodoListUseCaseImpl(private val gateway: TodoGateway): GetTodoListUseCase {
    override suspend fun execute() = gateway.get()
}
