package com.dev777popov.libraryapp

import android.app.Application
import androidx.room.Room
import com.dev777popov.libraryapp.db.AppDatabase

class App : Application() {

    private lateinit var db: AppDatabase

    override fun onCreate() {
        super.onCreate()
        instance = this

        db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "database-automate"
        ).build()
    }

    fun getDb(): AppDatabase {
        return db
    }

    companion object {
        var instance: App? = null
    }
}