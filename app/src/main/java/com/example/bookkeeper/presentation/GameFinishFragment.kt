package com.example.bookkeeper.presentation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bookkeeper.databinding.GameFinishFragmentBinding

class GameFinishFragment : Fragment() {

    private var _binding: GameFinishFragmentBinding? = null
    private val binding: GameFinishFragmentBinding
        get() = _binding ?: throw RuntimeException("GameFinishFragmentBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?):
            View {
        _binding = GameFinishFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}