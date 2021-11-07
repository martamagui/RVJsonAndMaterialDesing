package com.marta.jsonmaterialdesign

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.marta.jsonmaterialdesign.databinding.ItemFilmBinding
import com.marta.jsonmaterialdesign.model.Film

class FilmAdapter(private val filmResponses: MutableList<Film>) :
    RecyclerView.Adapter<FilmAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemFilmBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FilmAdapter.ViewHolder, position: Int) {
        val film = filmResponses[position]
        holder.binding.tvTitle.text = film.title
        holder.binding.tvOriginalTitle.text = film.originalTitle
        holder.binding.tvRate.text = film.rtScore
        Glide.with(holder.binding.ivFilm.context)
            //Se ve mejor que la imagen.
            //TODO poner en el detail la img normal en vez del banner
            // TODO: 03/11/2021  
            .load(film.movieBanner)
            .placeholder(R.drawable.ic_launcher_background)
            .into(holder.binding.ivFilm)
    }

    override fun getItemCount(): Int {
        return filmResponses.size
    }

    inner class ViewHolder(val binding: ItemFilmBinding) : RecyclerView.ViewHolder(binding.root)
}