package com.example.pembahasansumatif1delli_isna

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    companion object{

        val  INTENT_PARCELABLE ="OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun buku(view: View){
        val ganti = Intent(this@MainActivity,HalBuku::class.java)
        startActivity(ganti)
    }
    fun guru(view: View){
        val ganti = Intent(this@MainActivity,HalGuru::class.java)
        startActivity(ganti)
    }
    fun siswa(view: View){
        val ganti = Intent(this@MainActivity,HalSiswa::class.java)
        startActivity(ganti)
    }

    fun visimisi(view: View){
        val ganti = Intent(this@MainActivity,HalVisiMisi::class.java)
        startActivity(ganti)
    }
}