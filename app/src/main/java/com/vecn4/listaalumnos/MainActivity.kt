package com.vecn4.listaalumnos

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: AlumnosAdapter
    private lateinit var alumnosList: List<Alumnos>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        recyclerView = findViewById(R.id.recyclerAlumnos)
        recyclerView.layoutManager = LinearLayoutManager(this)

        alumnosList = mostrarAlumnos()

        adapter = AlumnosAdapter(alumnosList)
        recyclerView.adapter = adapter

    }

    private fun mostrarAlumnos(): List<Alumnos> {
        return listOf(
            Alumnos("Noé Florián", 21, R.drawable.noe),
            Alumnos("Jhan Asto", 20, R.drawable.jhan),
            Alumnos("Leandro Alama", 20, R.drawable.leandro),
            Alumnos("Joel Saldaña", 21, R.drawable.joel),
        )
    }


}