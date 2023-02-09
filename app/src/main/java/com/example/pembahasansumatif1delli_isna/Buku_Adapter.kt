package com.example.pembahasansumatif1delli_isna

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class Buku_Adapter (private val dataSet:ArrayList<DataBuku>):
        RecyclerView.Adapter<Buku_Adapter.ViewHolder>(){
            class  ViewHolder(view: View): RecyclerView.ViewHolder(view){
                val image: ImageView =view.findViewById(R.id.imagebuku)
                val nama: TextView =view.findViewById(R.id.jenisbuku)
            }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflate= LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_buku_adapter,parent,false)
        return ViewHolder(inflate)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    val DataBuku = dataSet[position]
        holder.image.setImageResource(DataBuku.gambar)
        holder.nama.text=DataBuku.nama
    }

    override fun getItemCount(): Int {
       return dataSet.size
    }
}


