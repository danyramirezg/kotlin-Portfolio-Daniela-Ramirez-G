package com.dany.portfoliodanielaramirezg

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
//import android.support.design.widget.TabLayout;
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
//
//        tabLayout = findViewById<TabLayout>(R.id.tableLayoutId);
//        tabLayout.setupWithViewPager(viewpager)
//        tableLayoutId.setUpWithViewPager(viewPager)
//
//        tableLayoutId.setTabTextColors(color.GRAY, color.paseColor("white"))
    }
}