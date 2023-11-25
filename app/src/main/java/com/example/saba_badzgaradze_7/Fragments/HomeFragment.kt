package com.example.saba_badzgaradze_7.Fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.saba_badzgaradze_7.R

class HomeFragment: Fragment(R.layout.home_fragment) {

    private lateinit var button: Button
    private lateinit var editText: EditText

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button = view.findViewById(R.id.button)
        editText = view.findViewById(R.id.editTextNumber)

        button.setOnClickListener {

            val amount = editText.text.toString().toInt()

            val action = HomeFragmentDirections.actionHomeFragmentToDashboardFragment(amount)

            findNavController().navigate(action)
        }

    }

}