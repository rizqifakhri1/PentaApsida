package com.griding.pentaapsida

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.griding.pentaapsida.databinding.FragmentCyclingBinding
import com.griding.pentaapsida.databinding.FragmentHomepageBinding

class CyclingFragment : Fragment() {

    private var _binding: FragmentCyclingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentCyclingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.btnTimer.setOnClickListener {
            findNavController().navigate(R.id.action_cyclingFragment_to_timerCyclingFragment)
        }

    }

}