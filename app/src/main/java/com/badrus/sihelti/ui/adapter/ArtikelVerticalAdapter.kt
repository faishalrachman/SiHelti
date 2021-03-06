package com.badrus.sihelti.ui.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.badrus.sihelti.R
import com.badrus.sihelti.data.Artikel
import com.bumptech.glide.Glide


class ArtikelVerticalAdapter(val context: Context, val items : ArrayList<Artikel>) : RecyclerView.Adapter<ArtikelVerticalAdapter.ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {

        val layout = LayoutInflater.from(p0?.context).inflate(R.layout.list_artikel_vertical,p0,false)
        Log.d("anying",items.size.toString())
        return ViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        val item = items[p1]
        p0.textTitle.text = item.judul
        p0.textTanggal.text = item.tanggal
        p0.textKonten.text = item.konten
        Glide.with(context).load(item.gambar).into(p0.imageCover);
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageCover = view.findViewById<ImageView>(R.id.imageCard)
        val textTitle = view.findViewById<TextView>(R.id.textJudul)
        val textTanggal = view.findViewById<TextView>(R.id.textTanggal)
        val textKonten = view.findViewById<TextView>(R.id.textKonten)
    }
}