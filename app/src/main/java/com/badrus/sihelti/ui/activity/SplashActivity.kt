package com.badrus.sihelti.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.badrus.sihelti.R
import android.content.Intent
import android.os.Handler


class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed(Runnable { startActivity(Intent(this, TutorialActivity::class.java)); finish();}, 2000)
    }
}
