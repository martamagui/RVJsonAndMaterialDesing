package com.marta.jsonmaterialdesign.model

import com.google.gson.annotations.SerializedName
import com.marta.jsonmaterialdesign.FilmResponse

data class FilmsResponse (
    @SerializedName("films")
    val filmsGhibli: List<FilmResponse>
) {
}
