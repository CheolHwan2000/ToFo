package com.example.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Fortune")
data class Fortune(
    @PrimaryKey @ColumnInfo("fortune_no")
    val fortuneNo : Int,
    val fortune : String
)