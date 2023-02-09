package com.example.pembahasansumatif1delli_isna

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Guru_Adapter (private val dataSet:ArrayList<DataGuru>):
    RecyclerView.Adapter<Guru_Adapter.ViewHolder>(){
    class  ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val image: ImageView =view.findViewById(R.id.imageguru)
        val nama: TextView =view.findViewById(R.id.nama)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflate= LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_guru_adapter,parent,false)
        return ViewHolder(inflate)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val DataGuru = dataSet[position]
        holder.image.setImageResource(DataGuru.gambar)
        holder.nama.text=DataGuru.nama
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}