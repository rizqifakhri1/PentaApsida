package com.griding.pentaapsida

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.griding.pentaapsida.databinding.FragmentPraktikMeditasiBinding


class PraktikMeditasiFragment : Fragment() {

    private var _binding : FragmentPraktikMeditasiBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentPraktikMeditasiBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }

        //video

        binding.btnVideoSatu.setOnClickListener {
            val uri: Uri =
                Uri.parse("https://youtu.be/ViIIce-3zb4") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        binding.btnVideoDua.setOnClickListener {
            val uri: Uri =
                Uri.parse("https://youtu.be/wIiUxN5sE7Y") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        binding.btnVideoTiga.setOnClickListener {
            val uri: Uri =
                Uri.parse("https://youtu.be/KANeNpAwBa4") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }


        //audio

        binding.btnAudioSatu.setOnClickListener {
            val uri: Uri =
                Uri.parse("https://youtu.be/etPY7449eMg") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        binding.btnAudioDua.setOnClickListener {
            val uri: Uri =
                Uri.parse("https://youtu.be/4ffr26sUTLI") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        binding.btnAudioTiga.setOnClickListener {
            val uri: Uri =
                Uri.parse("https://youtu.be/LbXNV6f3J5g") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }



    }

}