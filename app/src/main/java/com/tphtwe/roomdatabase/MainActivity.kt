package com.tphtwe.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import com.tphtwe.roomdatabase.dao.BookDao
import com.tphtwe.roomdatabase.database.BookDatabase
import com.tphtwe.roomdatabase.model.Book

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = Room.databaseBuilder(applicationContext,
        BookDatabase::class.java,"BookDB").build()
        Log.d("res", "response")

        Thread{
            val book= Book(
                2,
                "Android Kotlin"

            )
            db.bookDao().saveBook(book)
            db.bookDao().getAllBook().forEach {
                Log.d("FetchDatabase>>>>", it.bookName)

            }
        }.start()
    }
}