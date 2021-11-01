package com.marta.jsonmaterialdesign.model

import com.google.gson.annotations.SerializedName

data class FilmsResponse (
    @SerializedName("films")
    val filmsGhibli: List<FilmResponse>
) {
}
