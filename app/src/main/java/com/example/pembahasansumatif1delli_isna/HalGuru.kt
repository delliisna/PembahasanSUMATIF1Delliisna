package com.example.pembahasansumatif1delli_isna

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HalGuru : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerAdapter : RecyclerView.Adapter<*>
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hal_guru)

        recyclerView = findViewById(R.id.rvguru)
        var guru = ArrayList<DataGuru>()
        guru.add(DataGuru(R.drawable.guru01,"Muhammad Danang"))
        guru.add(DataGuru(R.drawable.guru02,"Rukun Darmawan"))
        guru.add(DataGuru(R.drawable.guru03,"Suci Rahayu"))



        recyclerAdapter=Guru_Adapter(guru)
        layoutManager= LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        recyclerView.adapter=recyclerAdapter
        recyclerView.layoutManager=layoutManager

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }
}