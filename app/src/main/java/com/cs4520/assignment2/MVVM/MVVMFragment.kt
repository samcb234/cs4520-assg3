package com.cs4520.assignment2.MVVM

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.cs4520.assignment3.R
import com.cs4520.assignment3.databinding.CalculatorLayoutBinding

class MVVMFragment: Fragment(R.layout.calculator_layout) {
    private var _binding: CalculatorLayoutBinding? = null

    private val binding get() = _binding!!

    private val viewModel: CalcViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = CalculatorLayoutBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.add.setOnClickListener {
            viewModel.executeCommand("add", binding.input1.text.toString(), binding.input2.text.toString())
            resetInput()
        }

        binding.subtract.setOnClickListener {
            viewModel.executeCommand("subtract", binding.input1.text.toString(), binding.input2.text.toString())
            resetInput()
        }

        binding.multiply.setOnClickListener {
            viewModel.executeCommand("multiply", binding.input1.text.toString(), binding.input2.text.toString())
            resetInput()
        }

        binding.divide.setOnClickListener {
            viewModel.executeCommand("divide", binding.input1.text.toString(), binding.input2.text.toString())
            resetInput()
        }
        binding.root.setBackgroundColor(Color.parseColor("#ffb3ba"))
        observeError()
        observeResult()
        return view
    }

    private fun observeResult(){
        viewModel.result.observe(viewLifecycleOwner) {
            result -> binding.result.text = result
        }
    }

    private fun observeError(){
        viewModel.error.observe(viewLifecycleOwner){
            e ->
            if(!e){
                val toast = Toast.makeText(context, "Please enter two numbers", Toast.LENGTH_SHORT)
                toast.show()
                resetInput()
            }
        }
    }

    private fun resetInput(){
        binding.input1.setText("")
        binding.input2.setText("")
    }


}