package com.griding.pentaapsida

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.griding.pentaapsida.databinding.FragmentHomepageBinding

class HomepageFragment : Fragment() {

    private var _binding: FragmentHomepageBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomepageBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.bgMeditasi.setOnClickListener {
            findNavController().navigate(R.id.action_homepageFragment_to_meditasiFragment)
        }

        binding.bgKooperatif.setOnClickListener {
            findNavController().navigate(R.id.action_homepageFragment_to_kooperatifFragment)
        }

        binding.bgDiskusi.setOnClickListener {
            findNavController().navigate(R.id.action_homepageFragment_to_berdiskusiFragment)
        }

        binding.tvLihatSemua.setOnClickListener {
            findNavController().navigate(R.id.action_homepageFragment_to_listMotivasiFragment)
        }

        binding.tvLihatSemuaMenu.setOnClickListener {
            findNavController().navigate(R.id.action_homepageFragment_to_listMotivasiFragment)
        }


    }
}