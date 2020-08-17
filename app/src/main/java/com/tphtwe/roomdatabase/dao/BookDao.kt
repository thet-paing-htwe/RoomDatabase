package com.tphtwe.roomdatabase.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.tphtwe.roomdatabase.model.Book
//Dao like ApiInterface in retrofit//must be one
@Dao
interface BookDao {
    @Query(value= "Select * from Book")
    fun  getAllBook():List<Book>

    @Insert
    fun saveBook(book:Book)


}