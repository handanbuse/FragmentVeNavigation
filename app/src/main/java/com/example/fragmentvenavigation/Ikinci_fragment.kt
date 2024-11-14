package com.example.fragmentvenavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentvenavigation.databinding.FragmentBirinciFragmentBinding
import com.example.fragmentvenavigation.databinding.FragmentIkinciFragmentBinding


class Ikinci_fragment : Fragment() {
    private var _binding :FragmentIkinciFragmentBinding? = null
    private  val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentIkinciFragmentBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
           val isim= Ikinci_fragmentArgs.fromBundle(it).kullaniciismi
            binding.textView.text=isim
        }
    }

}