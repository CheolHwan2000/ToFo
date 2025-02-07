package com.example.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.data.local.dao.FortuneDao
import com.example.data.local.dao.UserFortuneDao
import com.example.data.local.entity.Fortune
import com.example.data.local.entity.UserFortune

@Database(entities = [UserFortune::class, Fortune::class], version = 1, exportSchema = false)
abstract class MainDatabase : RoomDatabase() {
    abstract fun userFortuneDao() : UserFortuneDao
    abstract fun fortuneDao() : FortuneDao
}