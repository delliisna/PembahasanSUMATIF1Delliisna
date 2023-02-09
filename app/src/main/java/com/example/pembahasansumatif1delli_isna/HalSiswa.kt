package com.example.pembahasansumatif1delli_isna

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList


class HalSiswa : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerAdapter : RecyclerView.Adapter<*>
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hal_siswa)

        recyclerView = findViewById(R.id.rvsiswa)
        var siswa = ArrayList<DataSiswa>()
        siswa.add(DataSiswa(R.drawable.siswa01,"Brenda Fisabilillah"))
        siswa.add(DataSiswa(R.drawable.siswa02,"Dewi Nur As'ari"))
        siswa.add(DataSiswa(R.drawable.siswa03,"Maulana Imam Pranata"))
        siswa.add(DataSiswa(R.drawable.siswa04,"Anggit Yuga Kusuma"))
        siswa.add(DataSiswa(R.drawable.siswa05,"Ega Nadi Fernanda"))

        recyclerAdapter=Siswa_Adapter(siswa)
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