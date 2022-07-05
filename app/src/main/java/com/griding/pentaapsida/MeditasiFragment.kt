package com.griding.pentaapsida

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.griding.pentaapsida.databinding.FragmentHomepageBinding
import com.griding.pentaapsida.databinding.FragmentMeditasiBinding

class MeditasiFragment : Fragment() {

    private var _binding: FragmentMeditasiBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMeditasiBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.bgManfaatMeditasi.setOnClickListener {
            findNavController().navigate(R.id.action_meditasiFragment_to_manfaatMeditasiFragment)
        }

        binding.bgPraktik.setOnClickListener {
            findNavController().navigate(R.id.action_meditasiFragment_to_praktikMeditasiFragment)
        }

        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}