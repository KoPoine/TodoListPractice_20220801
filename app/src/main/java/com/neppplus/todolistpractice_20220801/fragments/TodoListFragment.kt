package com.neppplus.todolistpractice_20220801.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.neppplus.todolistpractice_20220801.R
import com.neppplus.todolistpractice_20220801.adapters.TodoListViewAdapter
import com.neppplus.todolistpractice_20220801.datas.TodoData
import kotlinx.android.synthetic.main.fragment_todo_list.*

class TodoListFragment : Fragment(){

    val mList = ArrayList<TodoData>()

    lateinit var mListAdapter : TodoListViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_todo_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mList.clear()

//        더미 데이터 생성
         mList.add(TodoData("Kotlin 공부하기", 4.5))
         mList.add(TodoData("밥 먹기", 3.5))
         mList.add(TodoData("강아지 산책시키기", 4.0))
         mList.add(TodoData("장보러 다녀오기", 3.2))
         mList.add(TodoData("심부름하기", 2.5))
         mList.add(TodoData("내방 청소하기", 1.5))

        mListAdapter = TodoListViewAdapter(requireContext(), R.layout.todo_list_item, mList)
        todoListView.adapter = mListAdapter

        todoListView.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(requireContext(), "${i}번째 아이템 선택됨", Toast.LENGTH_SHORT).show()
        }
    }

}