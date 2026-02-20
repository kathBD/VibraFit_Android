package com.octapus.vibrafit

import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ExerciseAdapter(private val list: List<Exercise>) :
    RecyclerView.Adapter<ExerciseAdapter.ExerciseViewHolder>() {

    inner class ExerciseViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val img: ImageView = view.findViewById(R.id.imgExercise)
        val name: TextView = view.findViewById(R.id.tvExerciseName)
        val desc: TextView = view.findViewById(R.id.tvExerciseDesc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_exercise, parent, false)
        return ExerciseViewHolder(view)
    }

    override fun onBindViewHolder(holder: ExerciseViewHolder, position: Int) {
        val exercise = list[position]
        holder.name.text = exercise.name
        holder.desc.text = Html.fromHtml(exercise.description, Html.FROM_HTML_MODE_LEGACY)

        val imageUrl = exercise.images.firstOrNull()?.image
        Glide.with(holder.itemView.context)
            .load(imageUrl)
            .placeholder(R.drawable.ic_placeholder)
            .into(holder.img)
    }

    override fun getItemCount(): Int = list.size
}
