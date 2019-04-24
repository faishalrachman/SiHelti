package com.badrus.sihelti.ui.activity

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import com.badrus.sihelti.R
import com.github.paolorotolo.appintro.AppIntro2
import com.github.paolorotolo.appintro.AppIntroFragment
import com.github.paolorotolo.appintro.model.SliderPage



class TutorialActivity : AppIntro2() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val sliderPage = SliderPage()
        sliderPage.title = "Diagnosis of your health"
        sliderPage.setDescription("Diagnosis of your health before it getting worst")
        sliderPage.imageDrawable = R.drawable.logo1
        sliderPage.bgColor = Color.WHITE
        sliderPage.titleColor = Color.BLACK
        sliderPage.descColor = Color.BLACK

        val sliderPage2 = SliderPage()
        sliderPage2.title = "Get Notified Immediately"
        sliderPage2.setDescription("Get your personal health identification")
        sliderPage2.imageDrawable = R.drawable.logo1
        sliderPage2.bgColor = Color.WHITE
        sliderPage2.titleColor = Color.BLACK
        sliderPage2.descColor = Color.BLACK

        addSlide(AppIntroFragment.newInstance(sliderPage))
        addSlide(AppIntroFragment.newInstance(sliderPage2))
        setProgressButtonEnabled(true)
        showSkipButton(false)
        setBarColor(ContextCompat.getColor(applicationContext,R.color.colorPrimary))

    }

    override fun onDonePressed() {
        super.onDonePressed()
        startActivity(Intent(this,DashboardActivity::class.java))
        finish()
    }
}
