package com.neppplus.todolistpractice_20220801

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.todolistpractice_20220801.datas.UserData
import kotlinx.android.synthetic.main.activity_edit_profile.*

class EditProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        val userData = intent.getSerializableExtra("userData") as UserData

        nickEdt.setText(userData.nick)
        phoneNumEdt.setText(userData.phoneNum)
        addressEdt.setText(userData.address)

        saveBtn.setOnClickListener {
            val nick = nickEdt.text.toString()
            val phoneNum = phoneNumEdt.text.toString()
            val address = addressEdt.text.toString()

            val resultIntent = Intent()
            resultIntent.putExtra("nick", nick)
                .putExtra("phoneNum", phoneNum)
                .putExtra("address", address)
            setResult(RESULT_OK, resultIntent)
            finish()
        }
    }
}