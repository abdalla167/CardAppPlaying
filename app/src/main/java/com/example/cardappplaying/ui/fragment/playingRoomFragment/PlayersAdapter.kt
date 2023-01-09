package com.example.cardappplaying.ui.fragment.playingRoomFragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.CardApp.model.Person
import com.example.cardappplaying.R
import kotlinx.android.synthetic.main.item_player.view.*

class PlayersAdapter(var listPlayer: ArrayList<Person>): RecyclerView.Adapter<PlayersAdapter.PlayerViewHolder>() {

    inner class PlayerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    fun addnewplayer(person: Person)
    {
        if(!listPlayer?.contains(person)!!)
            listPlayer?.add(person)
        listPlayer?.let {
            notifyItemInserted (it.size)
        notifyDataSetChanged()
        }
    }


//    companion object {
//        private val differCallback = object : DiffUtil.ItemCallback<Person>() {
//            override fun areItemsTheSame(oldItem: Person, newItem: Person): Boolean {
//                return oldItem.card == newItem.card
//            }
//
//            override fun areContentsTheSame(oldItem: Person, newItem: Person): Boolean {
//                return oldItem == newItem
//            }
//        }
//    }
//
//    val differ = AsyncListDiffer(this, differCallback)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerViewHolder{
        return PlayerViewHolder(
            LayoutInflater.from(parent.context).inflate(

                R.layout.item_player,
                parent,
                false
            )
        )

    }

    private var onItemClickListener: ((Person) -> Unit)? = null


    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
        //val player = differ.currentList[position]
        val player= listPlayer?.get(position)
        holder.itemView.apply {
            player?.card?.get(0)?.imageCard?.toInt()?.let {
                imagefrincardone.setImageResource(it)
                imagefrincardone.visibility = View.GONE

            }
            player?.card?.get(1)?.imageCard?.toInt()?.let {
                imagefrincardtwo.setImageResource(it)
                imagefrincardtwo.visibility = View.GONE


            }
            player?.card?.get(2)?.imageCard?.toInt()?.let { imagefrincardthree.setImageResource(it)
                imagefrincardthree.visibility = View.GONE
            }
            player?.card?.get(3)?.imageCard?.toInt()?.let { imagefrincardfour.setImageResource(it)
                imagefrincardfour.visibility = View.GONE
            }
            player?.name.let {
                textnameplayeritem.text=it
            }


            setOnClickListener {
            onItemClickListener?.let{
                player?.let { it1 -> it(it1) }
            }
            }

        }


    }

    override fun getItemCount(): Int {
        if(listPlayer!=null)
        return listPlayer.size
        else
            return 0
    }

    fun setOnItemClickListener(listener: (Person) -> Unit) {
        onItemClickListener = listener
    }
}