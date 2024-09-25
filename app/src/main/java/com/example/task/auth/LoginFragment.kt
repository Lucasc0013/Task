package com.example.task.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.task.R
import com.example.task.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nextScreens()
    }

    private fun nextScreens(){
        binding.btncreat.setOnClickListener{
         findNavController().navigate(R.id.action_loginFragment2_to_cadastroFragment)
        }
        binding.btnrecover.setOnClickListener{
            findNavController().navigate(R.id.action_loginFragment2_to_countRecouverFragment)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}