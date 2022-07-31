package com.example.databindingwithlivedata

// https://www.youtube.com/watch?v=TVlpENKIg2A&list=PLRKyZvuMYSIO0jLgj8g6sADnD0IBaWaw2&index=8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.databindingwithlivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        // If you are binding live data in XML, you have to specify the lifecycleOwner
        // that should be used for observing changes in live data.
        // Hover over lifecycleOwner to read more information and understand how to set lifecycleOwner
        // while using fragments
        binding.lifecycleOwner = this

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.mainViewModel = mainViewModel

    }
}