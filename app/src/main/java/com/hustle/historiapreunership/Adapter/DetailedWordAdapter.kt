package com.hustle.historiapreunership.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hustle.historiapreunership.Model.Word
import com.hustle.historiapreunership.R

class DetailedWordAdapter (private val detailedList:ArrayList<Word>) :
    RecyclerView.Adapter<DetailedWordAdapter.DetailedViewHolder>() {

    private lateinit var mListener : onItemClickListener

    interface onItemClickListener{
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener){
        mListener = listener
    }

    class DetailedViewHolder(itemView : View, listener: onItemClickListener) : RecyclerView.ViewHolder(itemView) {
        val word : TextView = itemView.findViewById(R.id.word)

        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailedViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_word, parent, false)
        return DetailedViewHolder(view,mListener)
    }

    override fun onBindViewHolder(holder: DetailedViewHolder, position: Int) {
        val currentItem = detailedList[position]
        holder.word.text = currentItem.Abjad
    }

    override fun getItemCount(): Int {
        return detailedList.size
    }

}