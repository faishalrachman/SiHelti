package com.badrus.sihelti.ui.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.view.MenuItem
import com.badrus.sihelti.R
import com.badrus.sihelti.ui.fragment.BeritaFragment
import com.badrus.sihelti.ui.fragment.HomeFragment
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    val Home = HomeFragment()
    val Berita = BeritaFragment()

    override fun onNavigationItemSelected(p0: MenuItem): Boolean {
        when (p0.itemId) {
            R.id.action_home -> {
                loadFragment(Home)
                return true
            }
            R.id.action_berita -> {
                loadFragment(Berita)
                return true

            }
            R.id.action_diagnosis -> {
                startActivity(Intent(this,DiagnosaActivity::class.java))
                return false
            }
            R.id.action_riwayat -> {
                loadFragment(Home)
                return true

            }
            R.id.action_profil -> {
                loadFragment(Home)
                return true

            }

        }
        return false
    }

    fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.layoutFrameDash, fragment).commit()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        bottomNav.setOnNavigationItemSelectedListener(this)
        loadFragment(Home)
        bottomNav.selectedItemId = R.id.action_home
        bottomNav.itemIconTintList = null
    }
}
