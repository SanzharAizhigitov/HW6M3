package com.geektech.hw6month3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.Fragment
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.geektech.hw6month3.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private var  list = arrayListOf<Song>()
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.root
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.fragment_one_FL , Fragment_one.newInstance() ).commit()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_two_FL , Fragment_two.newInstance() ).commit()
    }


}


