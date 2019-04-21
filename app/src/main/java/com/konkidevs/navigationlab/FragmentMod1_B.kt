package com.konkidevs.navigationlab


import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_fragment_mod1__b.*



class FragmentMod1_B : Fragment() {

    private var safeArgs: FragmentMod1_BArgs? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_fragment_mod1__b, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonGo1B.setOnClickListener{
            val bundle = Bundle()
            bundle.putString("hello", "hola")
            findNavController().navigate(R.id.action_fragmentMod1_B_to_fragmentMod2_A2, bundle)
        }

        arguments?.let {
            safeArgs = FragmentMod1_BArgs.fromBundle(it)
        }

        fragmentMod1_BName.text = safeArgs?.valor1B

    }
}
