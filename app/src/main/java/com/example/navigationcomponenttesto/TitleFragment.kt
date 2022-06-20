package com.example.navigationcomponenttesto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import com.example.navigationcomponenttesto.databinding.FragmentTitleBinding


class TitleFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {


        return inflater.inflate(R.layout.fragment_title, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = Navigation.findNavController(view)

        val botonComenzar : Button = view.findViewById(R.id.botonComenzar)

        botonComenzar.setOnClickListener {
            navController.navigate(R.id.action_titleFragment_to_gameFragment2)
        }

    }
}