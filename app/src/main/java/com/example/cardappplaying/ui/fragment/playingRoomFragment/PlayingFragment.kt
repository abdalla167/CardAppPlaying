package com.example.cardappplaying.ui.fragment.playingRoomFragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.CardApp.model.Person
import com.example.cardappplaying.R
import com.example.cardappplaying.other.Resource
import com.example.cardappplaying.other.SharedPrefrance
import kotlinx.android.synthetic.main.fragment_playing.*
import kotlinx.coroutines.launch


class PlayingFragment : Fragment() {
    lateinit var adapter: PlayersAdapter
    var arrayOfPlayer = ArrayList<Person>()
    private lateinit var viewModel: ViewModelInCame
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view: View = inflater.inflate(R.layout.fragment_playing, container, false)
        viewModel = ViewModelProvider(this).get(ViewModelInCame::class.java)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var sh = SharedPrefrance(view.context)
        namePlayer.text = sh.getNamePlayer()
        adapter = PlayersAdapter(arrayOfPlayer)
        viewModel.getPlayers(sh.getIDRoom(), sh.getIDPlayer())
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.getPlayerChange(sh.getIDRoom())
        }
        viewModel.GetPlayer.observe(viewLifecycleOwner, Observer {
            //adapter.differ.submitList(it.data)
            Log.d("TAG", "onViewCreated: " + it)
            if (!it.name.equals("")) {
                adapter.addnewplayer(it)
                adapter.notifyDataSetChanged()

            }

        })
        viewModel.player.observe(viewLifecycleOwner, Observer {
            when (it) {
                is Resource.Loading -> {

                }
                is Resource.Success -> {
                    it.data?.card?.get(0)?.imageCard?.let { it1 -> mycard_one.setImageResource(it1.toInt()) }
                    it.data?.card?.get(1)?.imageCard?.let { it1 -> mycard_two.setImageResource(it1.toInt()) }
                    it.data?.card?.get(2)?.imageCard?.let { it1 -> mycard_three.setImageResource(it1.toInt())
                        mycard_three.visibility = GONE
                    }
                    it.data?.card?.get(3)?.imageCard?.let { it1 -> mycard_four.setImageResource(it1.toInt())
                        mycard_four.visibility = GONE
                    }

                }
            }
        })
        viewModel.GetAllPlayer.observe(viewLifecycleOwner, Observer {
            when (it) {
                is Resource.Loading -> {

                }
                is Resource.Success -> {
                    Log.d("TAG", "onViewCreatedmmmm: " + it.data)
                    adapter = it.data?.let { it1 -> PlayersAdapter(it1) }!!
                    //adapter.differ.submitList(it.data)
                    carouselRecyclerview.adapter = adapter
                    carouselRecyclerview.set3DItem(true)
                    carouselRecyclerview.setAlpha(true)
                    carouselRecyclerview.setFlat(true)
                    val carouselLayoutManager = carouselRecyclerview.getCarouselLayoutManager()
                    val currentlyCenterPosition = carouselRecyclerview.getSelectedPosition()


                }
            }

        })


    }


}