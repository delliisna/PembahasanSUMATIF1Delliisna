package com.example.pembahasansumatif1delli_isna

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView


class HalDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hal_detail)

        val DataBuku = intent.getParcelableExtra<DataBuku>(MainActivity.INTENT_PARCELABLE)


        val gambar = findViewById<ImageView>(R.id.imagebuku)
        val nama = findViewById<TextView>(R.id.jenisbuku)

        gambar.setImageResource(DataBuku?.gambar!!)
        nama.text= DataBuku.nama
        

    }
}