package com.konkidevs.navigationlab


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_fragment_mod2_a.*


class FragmentMod2_A : Fragment() {

    private var safeArgs: FragmentMod2_AArgs? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_fragment_mod2_a, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonGo2A.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMod2_A_to_fragmentMod2_B)
        }

        arguments?.let {
            safeArgs = FragmentMod2_AArgs.fromBundle(it)
        }


        fragmentMod2_AName.text = safeArgs?.hello

    }

}
