package com.deknowh.digitalnotice.data

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

interface NoteDao {
    @Query("SELECT * FROM notes_table ORDER BY createdDate DESC")
    fun getAllNotes(): Flow<List<NoteEntity>>

    @Insert
    suspend fun insertNote(noteEntity: NoteEntity)

    @Update
    suspend fun updateNote(noteEntity: NoteEntity)

    @Delete
    suspend fun deleteNote(noteEntity: NoteEntity)

    @Query("DELETE FROM notes_table")
    suspend fun deleteAllNotes()



}