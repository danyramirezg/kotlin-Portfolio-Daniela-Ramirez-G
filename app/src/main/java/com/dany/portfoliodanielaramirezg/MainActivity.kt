package com.dany.portfoliodanielaramirezg

import android.graphics.Color
import android.graphics.Color.GRAY
import android.graphics.Color.parseColor
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dany.portfoliodanielaramirezg.controller.DevPagerAdapter
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the view Pager
        viewPager.adapter = DevPagerAdapter(supportFragmentManager)

        // Setup the tab-Layout
        tableLayoutId.setupWithViewPager(viewPager)

        // To change the color of the tabs when they are clicked.
        tableLayoutId.setTabTextColors(Color.parseColor("black"),Color.parseColor("white"))

    }
}