package com.hustle.historiapreunership.DetailedWord

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hustle.historiapreunership.Adapter.DetailedWordAdapter
import com.hustle.historiapreunership.Model.Word
import com.hustle.historiapreunership.R

class DetailedWordI : Fragment() {

    private lateinit var adapter: DetailedWordAdapter
    private lateinit var recView : RecyclerView
    private lateinit var detailedArrayList : ArrayList<Word>

    lateinit var Word : ArrayList<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detailed_word_f, container, false)
    }

    private fun dataInitialize(){
        detailedArrayList = arrayListOf<Word>()

        Word = arrayListOf(
            getString(R.string.Andora),
            getString(R.string.Australia),
            getString(R.string.Austria)
        )
    }
}