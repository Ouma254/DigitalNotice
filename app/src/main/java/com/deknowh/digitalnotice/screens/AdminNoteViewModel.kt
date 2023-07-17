package com.deknowh.digitalnotice.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.deknowh.digitalnotice.data.NoteEntity
import com.deknowh.digitalnotice.data.repository.NoteRepository
import kotlinx.coroutines.launch

class AdminNoteViewModel //@Inject constructor(
    (
    private val notesRepository: NoteRepository,
): ViewModel() {
    private val colors = listOf(
        0xFF61d988,
        0xFF6a3fa0,
        0xFFf9c613,
    )

    fun addNote(noteTitle: String, noteDescription: String) {
        viewModelScope.launch {
            val noteEntity = NoteEntity(
                title = noteTitle,
                description = noteDescription,
                color = colors.shuffled().random(),
                createdDate = System.currentTimeMillis(),
            )

            notesRepository.insertNote(noteEntity)
        }
    }

    fun updateNote(noteEntity: NoteEntity) {
        viewModelScope.launch {
            notesRepository.updateNote(noteEntity)
        }
    }
}