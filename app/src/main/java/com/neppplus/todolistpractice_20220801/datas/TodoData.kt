package com.neppplus.todolistpractice_20220801.datas

import java.io.Serializable

class TodoData (
    val title : String,
    val rating : Double,
    val place : String
        ) : Serializable {
}