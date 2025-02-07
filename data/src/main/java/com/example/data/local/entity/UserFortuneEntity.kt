package com.example.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_fortune")
data class UserFortune (
    @PrimaryKey
    val name : String,
    val todayFortune : String
)
