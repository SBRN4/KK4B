package com.example.projectakhirkk4a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.projectakhirkk4a.fragment.CariFragment
import com.example.projectakhirkk4a.fragment.FavoritFragment
import com.example.projectakhirkk4a.fragment.ProfilFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cariFragment = CariFragment()
        val favoritFragment= FavoritFragment()
        val profilFragment = ProfilFragment()

        makeCurrentFragment (cariFragment)

        val bottom_navigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottom_navigation.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.menu_cari  -> makeCurrentFragment(cariFragment)
                R.id.menu_favorit -> makeCurrentFragment(favoritFragment)
                R.id.menu_person -> makeCurrentFragment(profilFragment)
            }

            true
        }

    }

    private fun makeCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fram_nav, fragment)
            commit()
        }
    }
}