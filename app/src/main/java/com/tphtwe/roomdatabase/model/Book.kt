package com.tphtwe.roomdatabase.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
//() initialize not need //like data class//{} need initialize
@Entity

class Book (
    @PrimaryKey
    @ColumnInfo(name="id")
    var bookId:Int ,
    @ColumnInfo(name = "book_name")
    var bookName:String
)