package com.example.fragmentvenavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.fragmentvenavigation.birinci_fragmentDirections.Companion.actionBirinciFragmentToIkinciFragment
import com.example.fragmentvenavigation.databinding.FragmentBirinciFragmentBinding


class birinci_fragment : Fragment() {
    private var _binding : FragmentBirinciFragmentBinding? = null
    private  val binding get() = _binding!!







    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding=FragmentBirinciFragmentBinding.inflate(inflater,container,false)
        val view = binding.root
        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.editTextText.setText("")
        binding.button.setOnClickListener() {
            sonraki(it)


        }
    }

    private fun sonraki(view: View?) {

    }


    fun sonraki(view: View, BirinciFragmentDirections: Any){

        val isim= binding.editTextText.text.toString()

        val action =birinci_fragmentDirections.actionBirinciFragmentToIkinciFragment(isim)
        Navigation.findNavController(view).navigate(action)



    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding= null
    }




}