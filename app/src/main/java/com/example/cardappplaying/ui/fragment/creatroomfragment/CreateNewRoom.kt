package com.example.cardappplaying.ui.fragment.creatroomfragment

import android.graphics.Bitmap
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import android.widget.Toast
import android.widget.Toast.makeText
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.cardappplaying.R
import com.example.cardappplaying.other.CreatingCardes
import com.example.cardappplaying.other.CreatingQRCode
import com.example.cardappplaying.other.Resource
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.fragment_create_new_room.*

class CreateNewRoom : Fragment() {
    private lateinit var viewModel: ViewModelCreatNewRoom

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ViewModelCreatNewRoom::class.java)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create_new_room, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        creatqrcode.setOnClickListener {
          viewModel.creatNewRoom(CreatingCardes.creatingRoom(120))

        }
        viewModel.CreatingRoom.observe(viewLifecycleOwner, Observer {
            when(it)
            {
                is Resource.Loading -> {
                 progressid.visibility=View.VISIBLE
                }
                is Resource.Success->
                {
                    Snackbar.make(view, "Room Created Successfully", Snackbar.LENGTH_SHORT).show()
                    var bitmap:Bitmap
                    bitmap=CreatingQRCode.getQrCodeBitmap(it.data.toString())
                    qrcodeimage.setImageBitmap(bitmap)
                    progressid.visibility=View.GONE
                    creatqrcode.isClickable=false
                }
            }
        })

    }


}