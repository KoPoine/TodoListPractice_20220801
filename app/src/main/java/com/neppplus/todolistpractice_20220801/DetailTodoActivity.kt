package com.neppplus.todolistpractice_20220801

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.neppplus.todolistpractice_20220801.datas.TodoData
import kotlinx.android.synthetic.main.activity_detail_todo.*

class DetailTodoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_todo)

        val todoData = intent.getSerializableExtra("todoData") as TodoData

        titleTxt.text = todoData.title
        placeTxt.text = todoData.place
        todoRatingBar.rating = todoData.rating.toFloat()

        deleteBtn.backgroundTintList = ContextCompat.getColorStateList(this, R.color.red)
        placeTxt.setTextColor(ContextCompat.getColor(this, R.color.black))
    }
}