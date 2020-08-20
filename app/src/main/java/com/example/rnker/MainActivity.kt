package com.example.rnker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.rnker.Notifications.NotificationsFragment
import com.example.rnker.Olympic.OlympicFragment
import com.example.rnker.Purchase.PurchaseFragment
import com.example.rnker.SignIn.Login
import com.example.rnker.World.WorldFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val profileFragment=Login()
        val notiFragment=NotificationsFragment()
         val purchaseFragment=PurchaseFragment()
         val worldFragment=WorldFragment()
         val olympicFragment=OlympicFragment()
        makeCurrentFragment(profileFragment)
        bot_nav.setOnNavigationItemSelectedListener {
            when(it.itemId)
            {
                R.id.profile -> makeCurrentFragment(profileFragment)
                R.id.notifications -> makeCurrentFragment(notiFragment)
                R.id.Olympic -> makeCurrentFragment(olympicFragment)
                R.id.World -> makeCurrentFragment(worldFragment)
                R.id.Purchases -> makeCurrentFragment(purchaseFragment)
            }
            true
        }
        }
    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
        replace(R.id.wrapper, fragment)
        commit()
    }
}