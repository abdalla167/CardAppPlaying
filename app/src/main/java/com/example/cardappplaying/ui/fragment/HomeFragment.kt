package com.example.CardApp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.cardappplaying.R
import kotlinx.android.synthetic.main.fragment_create_new_room.*
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        createnewroom.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment2_to_createNewRoom)
        }
        enterintoromm.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment2_to_scaneQRCodeFragment)
        }

    }



}