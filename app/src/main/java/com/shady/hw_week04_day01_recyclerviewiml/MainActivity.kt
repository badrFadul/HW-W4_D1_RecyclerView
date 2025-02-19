package com.shady.hw_week04_day01_recyclerviewiml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private var data = mutableListOf<Citizen>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rvRecycleView)
        for (i in 1..27){
            val citizen = Citizen("a${i*2}",i)
            data += citizen
        }
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CitizenRecycleViewAdapter(data)


    }
}