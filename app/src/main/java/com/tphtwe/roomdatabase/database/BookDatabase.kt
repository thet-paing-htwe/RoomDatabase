package com.tphtwe.roomdatabase.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.tphtwe.roomdatabase.dao.BookDao
import com.tphtwe.roomdatabase.model.Book

//database must be abstract class
@Database(entities = [(Book::class)], version = 1)
abstract class BookDatabase :RoomDatabase(){

    abstract fun bookDao():BookDao

}