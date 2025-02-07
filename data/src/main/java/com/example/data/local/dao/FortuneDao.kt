package com.example.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.data.local.entity.Fortune

@Dao
interface FortuneDao {
    // Fortune 데이터베이스 삽입
    // @Insert(onConflict = OnConflictStrategy.REPLACE) - Room Database 에 Insert 해주며 충돌이 발생 할 경우 덮어쓰기
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertFortune(fortune: Fortune)

    // @Delete 전체 삭제
    @Delete
    fun deleteFortune()
}