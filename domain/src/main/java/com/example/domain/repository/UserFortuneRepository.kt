package com.example.domain.repository

import com.example.domain.model.UserFortune

interface UserFortuneRepository {
    suspend fun insertUserFortune(userFortune: UserFortune)
    suspend fun deleteUserFortune(userFortune: UserFortune)
}