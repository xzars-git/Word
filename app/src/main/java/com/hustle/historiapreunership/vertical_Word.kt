package com.hustle.historiapreunership

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hustle.historiapreunership.Adapter.WordAdapter
import com.hustle.historiapreunership.Model.Word


class vertical_Word : Fragment() {
    private lateinit var adapter : WordAdapter
    private lateinit var recView: RecyclerView
    private lateinit var wordArrayList : ArrayList<Word>
    private lateinit var abjad : ArrayList<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_vertical__word, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recView = view.findViewById(R.id.recView)
        recView.layoutManager = layoutManager
        recView.setHasFixedSize(true)
        adapter = WordAdapter(wordArrayList)
        recView.adapter = adapter
    }

    private fun dataInitialize(){
        wordArrayList = arrayListOf<Word>()

        abjad = arrayListOf(
            getString(R.string.A),
            getString(R.string.B),
            getString(R.string.C),
            getString(R.string.D),
            getString(R.string.E),
            getString(R.string.F),
            getString(R.string.G),
            getString(R.string.H),
            getString(R.string.I),
            getString(R.string.J)
        )

        for(i in abjad.indices){
            val word = Word(abjad[i])
            wordArrayList.add(word)
        }
    }
}