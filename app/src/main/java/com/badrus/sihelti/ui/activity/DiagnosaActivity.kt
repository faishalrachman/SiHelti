package com.badrus.sihelti.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.badrus.sihelti.R
import kotlinx.android.synthetic.main.activity_diagnosa.*

class DiagnosaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diagnosa)
        back.setOnClickListener { finish() }
    }
}
