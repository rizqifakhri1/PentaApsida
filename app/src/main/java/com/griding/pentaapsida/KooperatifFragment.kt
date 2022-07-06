package com.griding.pentaapsida

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.griding.pentaapsida.databinding.FragmentHomepageBinding
import com.griding.pentaapsida.databinding.FragmentKooperatifBinding

class KooperatifFragment : Fragment() {

    private var _binding: FragmentKooperatifBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentKooperatifBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnBack.setOnClickListener { findNavController().popBackStack() }

        binding.bgKuesioner.setOnClickListener { findNavController().navigate(R.id.action_kooperatifFragment_to_formKuesionerFragment) }
        binding.bgTips.setOnClickListener { findNavController().navigate(R.id.action_kooperatifFragment_to_tipsFragment) }
    }

}