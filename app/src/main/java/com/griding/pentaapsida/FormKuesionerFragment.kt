package com.griding.pentaapsida

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.griding.pentaapsida.databinding.FragmentFormKuesionerBinding
import com.griding.pentaapsida.databinding.FragmentHomepageBinding


class FormKuesionerFragment : Fragment() {

    private var _binding: FragmentFormKuesionerBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFormKuesionerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnBack.setOnClickListener { findNavController().popBackStack() }

/*        binding.btnKuesioner.setOnClickListener {
            val uri: Uri =
                Uri.parse("https://google.com") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }*/
    }

}