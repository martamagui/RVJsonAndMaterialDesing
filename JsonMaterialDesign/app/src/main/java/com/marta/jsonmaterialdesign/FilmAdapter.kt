package com.marta.jsonmaterialdesign

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.marta.jsonmaterialdesign.databinding.ItemFilmBinding

class FilmAdapter(private val filmResponses: List<FilmResponse>) : RecyclerView.Adapter<FilmAdapter.ViewHolder>() {
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
        Glide.with(holder.binding.ivFilm.context).load(film.image)
    }

    override fun getItemCount(): Int {
        return filmResponses.size
    }

    inner class ViewHolder(val binding: ItemFilmBinding) : RecyclerView.ViewHolder(binding.root)
}