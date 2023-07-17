package com.deknowh.digitalnotice.data

import androidx.room.RoomDatabase

abstract class NotesDataBase : RoomDatabase() {
    abstract fun noteDao(): NoteDao
}