package com.geektech.hw6month3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geektech.hw6month3.databinding.ActivityMainBinding
import com.geektech.hw6month3.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        binding.root
        setContentView(R.layout.activity_second)
    }

    override fun onResume() {
        super.onResume()
        binding.nameTv.text = intent.extras?.get("nameofsong").toString()

    }
}