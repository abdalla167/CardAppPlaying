package com.example.cardappplaying.ui.fragment.creatroomfragment

import android.content.pm.PackageManager
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.budiyev.android.codescanner.AutoFocusMode
import com.budiyev.android.codescanner.CodeScanner
import com.budiyev.android.codescanner.DecodeCallback
import com.budiyev.android.codescanner.ErrorCallback
import com.budiyev.android.codescanner.ScanMode
import com.example.cardappplaying.R
import com.example.cardappplaying.other.Resource
import com.example.cardappplaying.other.SharedPrefrance
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_scane_q_r_code.*


class ScaneQRCodeFragment : Fragment() {

    lateinit var codeScanner: CodeScanner
    private lateinit var viewModel: ViewModelCreatNewRoom
    private lateinit var sh:SharedPrefrance
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ViewModelCreatNewRoom::class.java)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_scane_q_r_code, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        startScannig()
         sh=SharedPrefrance(view.context)
        viewModel.AddnewPlayer.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
            when (it) {



                is Resource.Loading -> {

                    Toast.makeText(requireContext(), "Loading", Toast.LENGTH_LONG).show()
                    progress_scanner.visibility=View.VISIBLE

                }
                is Resource.Success -> {
                    sh.saveIDPlayerCurrent(it.data.toString())
                    progress_scanner.visibility=View.GONE
                    Snackbar.make(view, "login to Room Genrated", Snackbar.LENGTH_SHORT).show()
                    findNavController().navigate(R.id.action_scaneQRCodeFragment_to_playingFragment)


                }
                is Resource.Error ->
                {
                    Toast.makeText(requireContext(), "Error  "+it.message.toString(), Toast.LENGTH_LONG).show()
                    progress_scanner.visibility=View.GONE
                    findNavController().navigate(R.id.action_scaneQRCodeFragment_to_homeFragment2)

                }
            }


        })

        if (ContextCompat.checkSelfPermission(
                requireContext(),
                android.Manifest.permission.CAMERA
            ) ==
            PackageManager.PERMISSION_DENIED
        ) {
            ActivityCompat.requestPermissions(
                requireActivity(),
                arrayOf(android.Manifest.permission.CAMERA),
                123
            )
        } else {

        }
    }

    private fun startScannig() {

        //val scanner: CodeScannerView =scanner_view
        codeScanner = CodeScanner(requireContext(), scanner_view)
        codeScanner.camera = CodeScanner.CAMERA_BACK
        codeScanner.formats = CodeScanner.ALL_FORMATS
        codeScanner.autoFocusMode = AutoFocusMode.SAFE
        codeScanner.scanMode = ScanMode.SINGLE
        codeScanner.isAutoFocusEnabled = true
        codeScanner.isFlashEnabled = false

        codeScanner.decodeCallback = DecodeCallback {

            // runBlocking {
            viewModel.AddnewPlayerToFirebase(it.text.toString(), sh.getNamePlayer())
            sh.saveIDRoomCurrent(it.text.toString())


        }
        codeScanner.errorCallback = ErrorCallback {


        }

        scanner_view.setOnClickListener {
            codeScanner.startPreview()
        }

    }

    override fun onRequestPermissionsResult(
        requestCode: Int, permissions: Array<out String>, grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 123) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(requireContext(), "Camera permission genrated", Toast.LENGTH_LONG)
                    .show()
                startScannig()
            } else {
                Toast.makeText(requireContext(), "Camera permission deniad", Toast.LENGTH_LONG)
                    .show()

            }
        }

    }

    override fun onResume() {
        super.onResume()
        if (::codeScanner.isInitialized) {
            codeScanner?.startPreview()
        }
    }

    override fun onPause() {
        if (::codeScanner.isInitialized) {
            codeScanner?.releaseResources()
        }
        super.onPause()

    }
}