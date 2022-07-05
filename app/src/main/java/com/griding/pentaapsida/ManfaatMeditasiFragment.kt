package com.griding.pentaapsida

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.griding.pentaapsida.databinding.FragmentManfaatMeditasiBinding
import com.griding.pentaapsida.databinding.FragmentMeditasiBinding


class ManfaatMeditasiFragment : Fragment() {

    private var _binding : FragmentManfaatMeditasiBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentManfaatMeditasiBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnKonstrasi.setOnClickListener {
            findNavController().navigate(R.id.action_manfaatMeditasiFragment_to_konsetasiFragment)
        }
        binding.btnKesadaran.setOnClickListener {
            findNavController().navigate(R.id.action_manfaatMeditasiFragment_to_kesadaranFragment)
        }

        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}