package com.neppplus.todolistpractice_20220801.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.todolistpractice_20220801.fragments.GoalFragment
import com.neppplus.todolistpractice_20220801.fragments.SettingFragment
import com.neppplus.todolistpractice_20220801.fragments.TodoListFragment

class MainViewPagerAdapter (fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return TodoListFragment()
            1 -> return GoalFragment()
            else -> return SettingFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return "TodoList"
            1 -> return "Goal"
            else -> return "Setting"
        }
    }
}