package com.example.task.ui

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.task.R
import com.example.task.databinding.FragmentSplash2Binding


class SplashFragment : Fragment() {

    private var _binding: FragmentSplash2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSplash2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
     Handler(Looper.getMainLooper()).postDelayed(this::check,3000)
    }

    private fun check(){
        findNavController().navigate(R.id.action_splashFragment_to_authention)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}