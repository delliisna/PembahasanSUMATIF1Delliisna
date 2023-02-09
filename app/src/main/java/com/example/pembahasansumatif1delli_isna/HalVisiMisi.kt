package com.example.pembahasansumatif1delli_isna

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HalVisiMisi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hal_visi_misi)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    }
