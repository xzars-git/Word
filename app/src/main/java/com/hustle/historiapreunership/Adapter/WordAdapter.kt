package com.hustle.historiapreunership.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hustle.historiapreunership.Model.Word
import com.hustle.historiapreunership.R

class WordAdapter(private val wordList:ArrayList<Word>)
    : RecyclerView.Adapter<WordAdapter.WordViewHolder>(){

    class WordViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        val word : TextView = itemView.findViewById(R.id.word)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_word, parent, false)
        return WordViewHolder(view)
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        val word = wordList[position]
        holder.word.text = word.Abjad
    }

    override fun getItemCount(): Int {
        return wordList.size
    }
}