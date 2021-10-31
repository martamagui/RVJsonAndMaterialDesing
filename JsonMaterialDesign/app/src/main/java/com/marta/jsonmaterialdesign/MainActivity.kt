package com.marta.jsonmaterialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.marta.jsonmaterialdesign.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvFilms.layoutManager = LinearLayoutManager(this)
        binding.rvFilms.adapter = FilmAdapter(app.users){
            DetailActivity.starter(this,it.film_id)
        }

    }
}