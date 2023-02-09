package com.example.pembahasansumatif1delli_isna

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HalBuku : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerAdapter :RecyclerView.Adapter<*>
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hal_buku2)

        recyclerView = findViewById(R.id.rvbuku)
        var buku = ArrayList<DataBuku>()
        buku.add(DataBuku(R.drawable.rpl,"Rekayasa Perangkat Lunak"))
        buku.add(DataBuku(R.drawable.tkj,"Teknik Komputer Dan Jaringan"))
        buku.add(DataBuku(R.drawable.tkr,"Teknik Kendaraan Ringan"))
        buku.add(DataBuku(R.drawable.tsm,"Teknik Sepeda Motor"))
        buku.add(DataBuku(R.drawable.tb,"Tata Busana"))

        recyclerAdapter=Buku_Adapter(buku)
        layoutManager= LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerView.adapter=recyclerAdapter
        recyclerView.layoutManager=layoutManager

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}