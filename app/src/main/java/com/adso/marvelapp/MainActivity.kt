package com.adso.marvelapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.adso.marvelapp.adapter.HorizontalRecyclerViewAdapter
import com.adso.marvelapp.adapter.RecyclerViewAdapter
import com.adso.marvelapp.data.DataSource
import com.adso.marvelapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var miRecyler: RecyclerView
    lateinit var horizontalRecyclerView: RecyclerView
    lateinit var miAdapter: RecyclerViewAdapter
    lateinit var horizontalAdapter: HorizontalRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurar el RecyclerView vertical
        miRecyler = binding.rvsuperheroes
        miRecyler.setHasFixedSize(true)
        miRecyler.layoutManager = LinearLayoutManager(this)
        miAdapter = RecyclerViewAdapter() // Inicializamos miAdapter
        miAdapter.RecyclerViewAdapter(DataSource().getSuperHeroes(), this)
        miRecyler.adapter = miAdapter

        miAdapter.setOnItemClickListener(object : RecyclerViewAdapter.onItemClicListener {
            override fun onItemClickListener(position: Int) {
                /*Toast.makeText(this@MainActivity,
                    "SE SELECCIONO EL ITEM: " +
                "$position",Toast.LENGTH_SHORT).show()*/
                val intent = Intent(this@MainActivity,DetailActivity :: class.java)
                intent.putExtra("nombre", DataSource().getSuperHeroes().get(position).nombre)
                intent.putExtra("nombreReal", DataSource().getSuperHeroes().get(position).nombreReal)
                intent.putExtra("publisher", DataSource().getSuperHeroes().get(position).publisher)
                intent.putExtra("imagen", DataSource().getSuperHeroes().get(position).foto)
                startActivity(intent)
                Log.d("nombre heroe",DataSource().getSuperHeroes().get(position).nombre)

            }
        })

        // Configurar el RecyclerView horizontal
        horizontalRecyclerView = binding.horizontalRecyclerView
        horizontalRecyclerView.setHasFixedSize(true)
        horizontalRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        horizontalAdapter = HorizontalRecyclerViewAdapter(DataSource().getSuperHeroes()) // Inicializamos horizontalAdapter y pasamos la lista de Superhéroes
        horizontalRecyclerView.adapter = horizontalAdapter

    }
}

