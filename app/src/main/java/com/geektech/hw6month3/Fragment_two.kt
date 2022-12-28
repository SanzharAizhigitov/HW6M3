package com.geektech.hw6month3

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geektech.hw6month3.databinding.ActivityMainBinding
import com.geektech.hw6month3.databinding.FragmentTwoBinding


class Fragment_two : Fragment() {
    private var  list = arrayListOf<Song>()
    lateinit var binding: FragmentTwoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentTwoBinding.inflate(layoutInflater)
        binding.root
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val Adapter = SingAdapter(list, this::onClick)
        binding.songRV.adapter = Adapter
    }

    companion object {

        @JvmStatic
        fun newInstance() = Fragment_two()

    }
    private fun loadData() {
        list.add(Song("Группа бактерий на рукаве", "АпчЦой", "1", "1:59"))
        list.add(Song("Кабы не было тупых", "Из мультика Трое из Просточакшино", "2", "3:00"))
        list.add(Song("УууУуууУУ", "Ну этот ну тот ну который ну ты понял", "3", "2:04"))
        list.add(Song("Какдилак", "МоргРаботник", "4", "0:57"))
        list.add(Song("Какдилак", "МоргРаботник", "4", "0:57"))
        list.add(Song("Какдилак", "МоргРаботник", "4", "0:57"))
        list.add(Song("Какдилак", "МоргРаботник", "4", "0:57"))
        list.add(Song("Какдилак", "МоргРаботник", "4", "0:57"))
        list.add(Song("Какдилак", "МоргРаботник", "4", "0:57"))
        list.add(Song("Какдилак", "МоргРаботник", "4", "0:57"))
        list.add(Song("Какдилак", "МоргРаботник", "4", "0:57"))
        list.add(Song("Какдилак", "МоргРаботник", "4", "0:57"))
        list.add(Song("Какдилак", "МоргРаботник", "4", "0:57"))
        list.add(Song("Какдилак", "МоргРаботник", "4", "0:57"))
        list.add(Song("Какдилак", "МоргРаботник", "4", "0:57"))
    }
    private fun onClick(position: Int){
        val intent = Intent(activity, SecondActivity::class.java)
        intent.putExtra("nameofsong", list[position].nameofsong)
        startActivity(intent)
    }
}