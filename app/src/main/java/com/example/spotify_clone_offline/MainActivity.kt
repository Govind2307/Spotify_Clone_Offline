package com.example.spotify_clone_offline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.spotify_clone_offline.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}