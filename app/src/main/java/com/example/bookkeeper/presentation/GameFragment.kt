package com.example.bookkeeper.presentation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bookkeeper.R
import com.example.bookkeeper.databinding.GameFinishFragmentBinding
import com.example.bookkeeper.databinding.GameFragmentBinding

class GameFragment : Fragment() {

    private var _binding: GameFragmentBinding? = null
    private val binding: GameFragmentBinding
        get() = _binding ?: throw RuntimeException("GameFragmentBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?):
            View {
        _binding = GameFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}