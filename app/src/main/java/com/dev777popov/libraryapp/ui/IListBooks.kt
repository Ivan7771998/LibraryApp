package com.dev777popov.libraryapp.ui

import com.dev777popov.libraryapp.db.model.Book

interface IListBooks {
    fun addBooks(book: Book)
    fun deleteBooks(book: Book)
    fun editBooks(book: Book)
}