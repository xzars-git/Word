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

    class DetailedViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val word : TextView = itemView.findViewById(R.id.word)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailedViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_word, parent, false)
        return DetailedViewHolder(view)
    }

    override fun onBindViewHolder(holder: DetailedViewHolder, position: Int) {
        val currentItem = detailedList[position]
        holder.word.text = currentItem.Abjad
    }

    override fun getItemCount(): Int {
        return detailedList.size
    }

}