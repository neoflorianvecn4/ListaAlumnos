package com.vecn4.listaalumnos

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class AlumnosAdapter(private val alumnosList: List<Alumnos>) :
    RecyclerView.Adapter<AlumnosAdapter.AlumnoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlumnoViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_alumnos, parent, false)
        return AlumnoViewHolder(itemView)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: AlumnoViewHolder, position: Int) {
        val alumno = alumnosList[position]
        holder.nombre.text = alumno.nombre
        holder.edad.text = "Edad: ${alumno.edad} años"
        holder.foto.setImageResource(alumno.foto)
    }

    override fun getItemCount(): Int {
        return alumnosList.size
    }

    inner class AlumnoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nombre: TextView = itemView.findViewById(R.id.name)
        val edad: TextView = itemView.findViewById(R.id.edad)
        val foto: ImageView = itemView.findViewById(R.id.photo)
    }
}
