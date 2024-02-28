package com.cs4520.assignment2.MVP

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.cs4520.assignment3.R
import com.cs4520.assignment3.databinding.CalculatorLayoutBinding

class MVPFragment: Fragment(R.layout.calculator_layout), Contract.View {

    private var _binding: CalculatorLayoutBinding? = null
    private val binding get() = _binding!!

    private var presenter: Contract.Presenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = Presenter(this, Model())
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = CalculatorLayoutBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.add.setOnClickListener {
            presenter!!.onButtonClick("add", binding.input1.text.toString(), binding.input2.text.toString())
            setInputOne("")
            setInputTwo("")
        }

        binding.subtract.setOnClickListener {
            presenter!!.onButtonClick("subtract", binding.input1.text.toString(), binding.input2.text.toString())
            setInputOne("")
            setInputTwo("")
        }

        binding.multiply.setOnClickListener {
            presenter!!.onButtonClick("multiply", binding.input1.text.toString(), binding.input2.text.toString())
            setInputOne("")
            setInputTwo("")
        }

        binding.divide.setOnClickListener {
            presenter!!.onButtonClick("divide", binding.input1.text.toString(), binding.input2.text.toString())
            setInputOne("")
            setInputTwo("")
        }
        binding.root.setBackgroundColor(Color.parseColor("#c4b8e1"))
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun setInputOne(string: String) {
        binding.input1.setText(string)
    }

    override fun setInputTwo(string: String) {
        binding.input2.setText(string)
    }

    override fun setResult(string: Double) {
        binding.result.text = string.toString()
    }

    override fun displayErrorMessage() {
        val toast = Toast.makeText(context, "Please enter two numbers", Toast.LENGTH_SHORT)
        toast.show()
        setInputOne("")
        setInputTwo("")
    }
}