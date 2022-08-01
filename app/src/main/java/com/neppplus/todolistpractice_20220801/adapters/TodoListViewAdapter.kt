package com.neppplus.todolistpractice_20220801.adapters

import android.content.Context
import android.graphics.Paint
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inspector.IntFlagMapping
import android.widget.ArrayAdapter
import android.widget.CheckBox
import android.widget.TextView
import com.neppplus.todolistpractice_20220801.R
import com.neppplus.todolistpractice_20220801.datas.TodoData
import com.willy.ratingbar.ScaleRatingBar
import kotlinx.android.synthetic.main.todo_list_item.view.*

class TodoListViewAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<TodoData>
) : ArrayAdapter<TodoData>(mContext, resId, mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = LayoutInflater.from(mContext).inflate(resId, null)
        }
        val row = tempRow!!

        val data = mList[position]

        val titleTxt = row.findViewById<TextView>(R.id.titleTxt)
        val ratingBar = row.findViewById<ScaleRatingBar>(R.id.todoRatingBar)
        val doneCb = row.findViewById<CheckBox>(R.id.doneCb)

        titleTxt.text = data.title
        ratingBar.rating = data.rating.toFloat()
        doneCb.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
//                체크박스의 체크 여부 true => TextView에 취소선 작성
                titleTxt.paintFlags = Paint.STRIKE_THRU_TEXT_FLAG
            }
            else {
//                체크박스의 체크 여부 false => TextView에 취소선 삭제
                titleTxt.paintFlags = 0
            }
        }

        return row
    }

}