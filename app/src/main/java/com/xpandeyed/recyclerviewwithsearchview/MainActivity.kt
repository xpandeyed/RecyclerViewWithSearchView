package com.xpandeyed.recyclerviewwithsearchview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    
    private lateinit var rvCountries : RecyclerView
    private lateinit var countries : ArrayList<String>

    //new array for filtered list
    private lateinit var filteredCountries : ArrayList<String>
    private lateinit var svCountries : SearchView
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvCountries = findViewById(R.id.rvCountries)
        svCountries = findViewById(R.id.svCountries)

        rvCountries.layoutManager = LinearLayoutManager(this)
        rvCountries.itemAnimator = null

        countries = arrayListOf<String>("India", "America", "Sri Lanka", "Canada", "Japan", "England", "German")
        filteredCountries = arrayListOf<String>()

    }
}