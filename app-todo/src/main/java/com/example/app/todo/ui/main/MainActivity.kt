package com.example.app.todo.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.app.todo.R
import com.example.app.todo.databinding.ActivityMainBinding
import com.example.app.todo.databinding.MainFragmentBinding
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModel()
    private lateinit var binding: MainFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind()
    }

    private fun bind() {
        binding = DataBindingUtil.setContentView(this, R.layout.main_fragment)
        binding.vm = viewModel
        binding.lifecycleOwner = this
    }
}
