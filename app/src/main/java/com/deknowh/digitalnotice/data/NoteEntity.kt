package com.deknowh.digitalnotice.data


import androidx.room.Entity
import androidx.room.PrimaryKey


//@Parcelize
@Entity(tableName = "notes_table")
data class NoteEntity(
    @PrimaryKey(autoGenerate = true) val id: Int? = null,
    val title: String,
    val description: String,
    val color: Long,
    val createdDate: Long
)
