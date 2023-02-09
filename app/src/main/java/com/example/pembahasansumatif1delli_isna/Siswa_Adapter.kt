package com.example.pembahasansumatif1delli_isna

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Siswa_Adapter (private val dataSet:ArrayList<DataSiswa>):
    RecyclerView.Adapter<Siswa_Adapter.ViewHolder>(){
    class  ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val image: ImageView =view.findViewById(R.id.imagesiswa)
        val nama: TextView =view.findViewById(R.id.nama)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflate= LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_siswa_adapter,parent,false)
        return ViewHolder(inflate)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val DataSiswa = dataSet[position]
        holder.image.setImageResource(DataSiswa.gambar)
        holder.nama.text=DataSiswa.nama
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}