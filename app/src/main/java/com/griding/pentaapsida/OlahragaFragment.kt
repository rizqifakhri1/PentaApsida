package com.griding.pentaapsida

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.griding.pentaapsida.databinding.FragmentOlahragaBinding
import com.griding.pentaapsida.databinding.FragmentStopwatchBinding

class OlahragaFragment : Fragment() {

    private var _binding: FragmentOlahragaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentOlahragaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.bgCycling.setOnClickListener {
            findNavController().navigate(R.id.action_olahragaFragment_to_cyclingFragment)
        }

        binding.bgJoging.setOnClickListener {
            findNavController().navigate(R.id.action_olahragaFragment_to_jogingFragment)
        }

    }

}