package com.badrus.sihelti.ui.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.badrus.sihelti.R
import com.badrus.sihelti.helper.DummyHelper
import com.badrus.sihelti.ui.adapter.ArtikelVerticalAdapter
import kotlinx.android.synthetic.main.fragment_berita.*


class BeritaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_berita, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recycler.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        recycler.adapter = ArtikelVerticalAdapter(context!!,DummyHelper.artikel())
    }
}
