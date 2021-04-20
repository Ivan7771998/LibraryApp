package com.dev777popov.libraryapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.dev777popov.libraryapp.db.model.Book

@Database(entities = [Book::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun bookDao(): BookDao
}