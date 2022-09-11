package com.hustle.historiapreunership

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hustle.historiapreunership.Adapter.DetailedWordAdapter
import com.hustle.historiapreunership.Model.Word
import com.hustle.historiapreunership.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var adapter : DetailedWordAdapter
    private lateinit var recView: RecyclerView
    private lateinit var wordArrayList : ArrayList<Word>
    private lateinit var abjad : ArrayList<String>

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

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

        recView = findViewById(R.id.recView)
        recView.layoutManager = LinearLayoutManager(this)
        recView.setHasFixedSize(true)

        wordArrayList = arrayListOf<Word>()

        for(i in abjad.indices){
            val word = Word(abjad[i])
            wordArrayList.add(word)
        }

        var adapter = DetailedWordAdapter(wordArrayList)
        recView.adapter = adapter
        adapter.setOnItemClickListener(object : DetailedWordAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {
                Toast.makeText(this@MainActivity, "You Click on Item no $position",Toast.LENGTH_SHORT).show()
            }
        })
    }
}