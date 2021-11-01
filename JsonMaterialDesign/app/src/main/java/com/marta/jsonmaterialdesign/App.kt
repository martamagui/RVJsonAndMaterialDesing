package com.marta.jsonmaterialdesign

import android.app.Application
import com.marta.jsonmaterialdesign.model.Film

class App : Application() {
    val filmList: MutableList<Film> = mutableListOf()
//    override fun onCreate() {
//        super.onCreate()
//        films += Gson().fromJson(
//            GhibliData.ghibliJson,
//            FilmsResponse::class.java
//        ).films.toMutableList()
//    }
}

