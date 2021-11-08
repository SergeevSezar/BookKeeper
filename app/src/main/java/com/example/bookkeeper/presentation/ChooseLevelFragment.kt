package com.example.bookkeeper.presentation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bookkeeper.databinding.ChooseFragmentBinding

class ChooseLevelFragment : Fragment() {

    private var _binding: ChooseFragmentBinding? = null
    private val binding: ChooseFragmentBinding
    get() = _binding ?: throw RuntimeException("ChooseFragmentBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?):
            View {
        _binding = ChooseFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}