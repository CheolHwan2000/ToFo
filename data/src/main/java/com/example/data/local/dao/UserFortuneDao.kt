package com.example.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.data.local.entity.UserFortune

@Dao
interface UserFortuneDao {
    // UserFortune 데이터베이스 삽입
    // @Insert(onConflict = OnConflictStrategy.REPLACE) - Room Database 에 Insert 해주며 충돌이 발생 할 경우 덮어쓰기
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUserFortune(userFortune:UserFortune)

    // @Delete 전체 삭제
    @Delete
    fun deleteUserFortune()
}