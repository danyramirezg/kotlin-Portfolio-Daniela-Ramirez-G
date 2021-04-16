package com.dany.portfoliodanielaramirezg.controller

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.dany.portfoliodanielaramirezg.view.AboutFragment
import com.dany.portfoliodanielaramirezg.view.ContactFragment
import com.dany.portfoliodanielaramirezg.view.SkillsFragment
import com.dany.portfoliodanielaramirezg.view.WorkFragment

class DevPagerAdapter(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> return AboutFragment()
            1 -> return WorkFragment()
            2 -> return SkillsFragment()
            else -> return ContactFragment()
        }
    }

    override fun getCount(): Int {
        return 4
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> return "ABOUT"
            1 -> return "WORK"
            2 -> return "SKILLS"
            3 -> return "CONTACT"
        }
        return null
    }
}