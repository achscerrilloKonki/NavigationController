package com.konkidevs.navigationlab


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_fragment_mod1_a.*

class FragmentMod1_A : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_fragment_mod1_a, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonGo1A.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("valor1B", "Este es el valor de 1B")
            findNavController().navigate(R.id.action_fragmentMod1_A_to_fragmentMod1_B2, bundle)
        }
    }

}
