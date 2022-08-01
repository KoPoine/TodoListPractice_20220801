package com.neppplus.todolistpractice_20220801.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inspector.IntFlagMapping
import android.widget.ArrayAdapter
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

        titleTxt.text = data.title
        ratingBar.rating = data.rating.toFloat()

        return row
    }

}