package com.marta.jsonmaterialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.marta.jsonmaterialdesign.databinding.ActivityMainBinding
import com.marta.jsonmaterialdesign.model.FilmsResponse

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: FilmAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvFilms.layoutManager = LinearLayoutManager(this)
        val app = application as App
        val films = app.filmList
        val filmsResults = Gson().fromJson(GhibliData.ghibliJson, FilmsResponse::class.java)
        Log.d("mainmsg",(filmsResults.filmsGhibli.size).toString())
        films.addAll(filmsResults.filmsGhibli.toFilm())
        adapter = FilmAdapter(films)
        binding.rvFilms.adapter = adapter


    }
}
