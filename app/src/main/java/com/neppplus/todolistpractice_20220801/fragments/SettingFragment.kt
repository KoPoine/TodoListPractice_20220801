package com.neppplus.todolistpractice_20220801.fragments

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.neppplus.todolistpractice_20220801.EditProfileActivity
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
            val myIntent = Intent(requireContext(), EditProfileActivity::class.java)
            startActivityForResult(myIntent, REQ_FOR_EDIT)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == REQ_FOR_EDIT) {
                val nick = data!!.getStringExtra("nick")
                val phoneNum = data.getStringExtra("phoneNum")
                val address = data.getStringExtra("address")

                nickTxt.text = nick
                phoneNumTxt.text = phoneNum
                addressTxt.text = address
            }
        }
    }

}