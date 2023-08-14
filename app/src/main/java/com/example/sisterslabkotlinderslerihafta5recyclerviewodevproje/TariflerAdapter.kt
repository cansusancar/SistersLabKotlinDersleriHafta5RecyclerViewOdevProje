package com.example.sisterslabkotlinderslerihafta5recyclerviewodevproje

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.sisterslabkotlinderslerihafta5recyclerviewodevproje.databinding.CardTarifTasarimBinding

class TariflerAdapter (private val mContext: Context, private val tariflerListesi: List <Tarifler>) :RecyclerView.Adapter <TariflerAdapter.CardTasarimNesneleriniTutucu >() {

    inner class CardTasarimNesneleriniTutucu (val binding : CardTarifTasarimBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimNesneleriniTutucu {
        val binding = CardTarifTasarimBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CardTasarimNesneleriniTutucu(binding)
    }

    override fun getItemCount(): Int {
        return tariflerListesi.size
    }

    override fun onBindViewHolder(holder: CardTasarimNesneleriniTutucu, position: Int) {
        val tarif = tariflerListesi[position]

        val binding=holder.binding
        binding.textViewTarifBaslik.text =tarif.tarifAd

        val resimId = mContext.resources.getIdentifier(tarif.tarifResimAd, "drawable",mContext.packageName)

        binding.imageViewTarifResim.setImageResource(resimId)
        binding. buttonTariflereGit.setOnClickListener {

            Toast.makeText (mContext, "${tarif.tarifAd} yükleniyor...", Toast.LENGTH_SHORT).show()
        }


    }
}








