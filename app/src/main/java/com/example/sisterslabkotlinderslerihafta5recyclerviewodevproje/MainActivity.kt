package com.example.sisterslabkotlinderslerihafta5recyclerviewodevproje

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.sisterslabkotlinderslerihafta5recyclerviewodevproje.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  tariflerArrayList : ArrayList<Tarifler>
    private lateinit var adapter:TariflerAdapter
    private lateinit var binding : ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate (layoutInflater)
    setContentView(binding.root)
    binding.rv.setHasFixedSize(true)
    binding.rv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL)

    val f1 = Tarifler (1, "Kahvaltılıklar","kahvaltiliklar" )
    val f2 = Tarifler (2, "Et Yemekleri","etyemekleri" )
    val f3 = Tarifler (3, "Tavuk Yemekleri","tavukyemekleri" )
    val f4 = Tarifler (4, "Çorbalar","corba" )
    val f5 = Tarifler (5, "Yöresel Yemekler","yoreselyemekler" )
    val f6 = Tarifler (6, "Sebze Yemekleri","sebzeyemekleri" )




    tariflerArrayList =ArrayList <Tarifler> ()


    tariflerArrayList.add(f1)
        tariflerArrayList.add(f2)
        tariflerArrayList.add(f3)
        tariflerArrayList.add(f4)
        tariflerArrayList.add(f5)
        tariflerArrayList.add(f6)


    adapter = TariflerAdapter (this, tariflerArrayList)
    binding.rv.adapter = adapter
}
}