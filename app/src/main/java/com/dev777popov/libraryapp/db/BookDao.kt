package com.dev777popov.libraryapp.db

import androidx.room.*
import com.dev777popov.libraryapp.db.model.Book


@Dao
interface BookDao {

    @Query("SELECT * FROM book")
    fun getAll(): List<Book>

    @Query("SELECT * FROM book WHERE uidIN (:id)")
    fun loadBookById(id: Int): Book

    @Insert
    fun insertBook(book: Book)

    @Update
    fun updateBook(book: Book)

    @Delete
    fun deleteBook(book: Book)
}