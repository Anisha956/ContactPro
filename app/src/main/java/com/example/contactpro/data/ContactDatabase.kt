package com.example.contactpro.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.contactpro.model.Contact

@Database(entities = [Contact::class], version = 1, exportSchema = false)
abstract class ContactDatabase: RoomDatabase() {
    abstract fun contactDao(): ContactDao
}