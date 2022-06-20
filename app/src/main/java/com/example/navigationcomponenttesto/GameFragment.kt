package com.example.navigationcomponenttesto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.navigation.Navigation


class GameFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_game, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = Navigation.findNavController(view)

        val blueCheckBox : CheckBox = view.findViewById(R.id.respuestaUno)
        val greenCheckBox : CheckBox = view.findViewById(R.id.respuestaDos)
        val pinkCheckBox : CheckBox = view.findViewById(R.id.respuestaTres)
        val redCheckBox : CheckBox = view.findViewById(R.id.respuestaCuatro)

        val botonResponder : Button = view.findViewById(R.id.botonResponder)
        var contador : Int = 0

        botonResponder.setOnClickListener {

            if (contador >= 10) {
                Toast.makeText(view.context, "Too many tries, you lose", Toast.LENGTH_SHORT).show()
                navController.navigate(R.id.action_gameFragment2_to_gameOverFragment)

            }
            else {

                if (greenCheckBox.isChecked && !blueCheckBox.isChecked && !redCheckBox.isChecked && !pinkCheckBox.isChecked) {

                    navController.navigate(R.id.action_gameFragment2_to_gameWonFragment)
                } else if (!greenCheckBox.isChecked && !blueCheckBox.isChecked && !redCheckBox.isChecked && !pinkCheckBox.isChecked) {

                    contador++
                    Toast.makeText(
                        view.context,
                        "Please, choose one!",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    navController.navigate(R.id.action_gameFragment2_to_gameOverFragment)
                }
            }
        }
    }



}