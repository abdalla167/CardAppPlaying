package com.example.CardApp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.cardappplaying.R
import com.example.cardappplaying.other.SharedPrefrance
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
        var sh=SharedPrefrance(view.context)
        createnewroom.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment2_to_createNewRoom)
        }
        enterintoromm.setOnClickListener {
            if(usernameSacnner.text.toString().equals(""))
            {
                Toast.makeText(this@HomeFragment.requireActivity(),"pleas enter user name before scanning room",Toast.LENGTH_SHORT)
                usernameSacnner.error
            }
            else {
                sh.saveNamePlayer(usernameSacnner.text.toString())
                findNavController().navigate(R.id.action_homeFragment2_to_scaneQRCodeFragment)
            }
        }

    }



}