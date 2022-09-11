package com.hustle.historiapreunership

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hustle.historiapreunership.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //make the launcher screen as first fragment

        supportFragmentManager.beginTransaction().replace(R.id.Fragment_vertical_words, vertical_Word()).commit()
    }
}