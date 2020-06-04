package com.example.app.todo.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.app.todo.databinding.ItemTodosBinding
import com.example.modules.cores.models.Todo

class TodoListAdapter: RecyclerView.Adapter<TodoListAdapter.Holder>() {
    var list: List<Todo> = listOf()
        set(value) { field = value; notifyDataSetChanged() }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemTodosBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val todo = list[position]
        holder.bind(TodoItemViewModel().apply {
            title.set(todo.title)
            isCompleted.set(todo.isCompleted)
        })
    }

    class Holder(private val binding: ItemTodosBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(viewModel: TodoItemViewModel) {
            binding.vm = viewModel
        }
    }
}