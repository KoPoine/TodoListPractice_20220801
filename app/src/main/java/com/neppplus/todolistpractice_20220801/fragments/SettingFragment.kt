package com.neppplus.todolistpractice_20220801.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.neppplus.todolistpractice_20220801.R
import kotlinx.android.synthetic.main.fragment_setting.*

class SettingFragment : Fragment(){

    val REQ_FOR_EDIT = 1004

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_setting, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        editBtn.setOnClickListener {
            val myIntent = Intent(this, )
            startActivityForResult(myIntent, REQ_FOR_EDIT)
        }

    }

}