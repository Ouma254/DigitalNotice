package com.deknowh.digitalnotice.data.repository

import com.deknowh.digitalnotice.data.NoteDao
import com.deknowh.digitalnotice.data.NoteEntity
import kotlinx.coroutines.flow.Flow

class NoteRepository (
    private val noteDao: NoteDao,
        ) {
    fun getAllNotes(): Flow<List<NoteEntity>> {
        return noteDao.getAllNotes()
    }

    suspend fun insertNote(noteEntity: NoteEntity) {
        noteDao.insertNote(noteEntity)
    }

    suspend fun updateNote(noteEntity: NoteEntity) {
        noteDao.updateNote(noteEntity)
    }

    suspend fun deleteANote(noteEntity: NoteEntity) {
        noteDao.deleteNote(noteEntity)
    }

    suspend fun deleteAllNotes() {
        noteDao.deleteAllNotes()
    }
}