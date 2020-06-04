package com.example.app.todo.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.app.todo.databinding.MainFragmentBinding
import com.example.app.todo.ui.main.adapter.TodoListAdapter
import com.example.modules.cores.models.Todo
import org.koin.android.viewmodel.ext.android.viewModel
import java.io.File
import java.io.InputStream
import java.io.OutputStream
import java.net.URL

class MainFragment : Fragment() {
    private val viewModel: MainViewModel by viewModel()
    private lateinit var binding: MainFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = MainFragmentBinding.inflate(inflater, container, false)
        binding.vm = viewModel
        binding.lifecycleOwner = this
        return binding.root
    }

}


@BindingAdapter("bindTodos")
fun RecyclerView.bindTodos(list: List<Todo>) {
    val adapter = adapter as? TodoListAdapter ?: TodoListAdapter().apply {
        this.list = list
        layoutManager = LinearLayoutManager(context)
    }

    this.adapter = adapter
}