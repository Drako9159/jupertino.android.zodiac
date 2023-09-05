package com.drako9159.horoscoapp.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.drako9159.horoscoapp.R
import com.drako9159.horoscoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}