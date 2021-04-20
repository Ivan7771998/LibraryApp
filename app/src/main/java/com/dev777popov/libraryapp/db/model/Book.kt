package com.dev777popov.libraryapp.db.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Book (
    @PrimaryKey(autoGenerate = true) val uid: Int = 0,
    var name: String,
    var avtor: String,
)