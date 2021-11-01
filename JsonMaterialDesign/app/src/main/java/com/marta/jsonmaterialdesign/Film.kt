package com.marta.jsonmaterialdesign

import android.util.Log
import com.google.gson.annotations.SerializedName

data class Film(
    val film_id: String,
    val title: String,
    val originalTitle: String,
    val originalTitleRomanised: String,
    val image: String,
    val movieBanner: String,
    val description: String,
    val director: String,
    val producer: String,
    val releaseDate: String,
    val runningTime: String,
    val rtScore: String,
    val people: List<String>,
    val species: List<String>,
    val locations: List<String>,
    val vehicles: List<String>,
    val url: String
) {
    constructor(filmResponse: FilmResponse) : this(
        filmResponse.film_id,
        filmResponse.title,
        filmResponse.originalTitle,
        filmResponse.originalTitleRomanised,
        filmResponse.image,
        filmResponse.movieBanner,
        filmResponse.description,
        filmResponse.director,
        filmResponse.producer,
        filmResponse.releaseDate,
        filmResponse.runningTime,
        filmResponse.rtScore,
        filmResponse.people,
        filmResponse.species,
        filmResponse.locations,
        filmResponse.vehicles,
        filmResponse.url
    )


}

fun FilmResponse.toFilm(): Film {
    Log.d("Peli",this.title)
    return Film(
        this.film_id,
        this.title,
        this.originalTitle,
        this.originalTitleRomanised,
        this.image,
        this.movieBanner,
        this.description,
        this.director,
        this.producer,
        this.releaseDate,
        this.runningTime,
        this.rtScore,
        this.people,
        this.species,
        this.locations,
        this.vehicles,
        this.url
    )
}
fun List<FilmResponse>.toFilm():List<Film>{
    return this.map {it.toFilm()}
}