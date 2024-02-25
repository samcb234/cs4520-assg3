package com.cs4520.assignment2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.cs4520.assignment3.R
import com.cs4520.assignment3.databinding.HomeLayoutBinding

class HomeFragment: Fragment(R.layout.home_layout) {

    private var _binding: HomeLayoutBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = HomeLayoutBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.mvp.setOnClickListener({
            findNavController().navigate(R.id.action_navigate_to_mvp_calc)
        })
        return view
    }
}