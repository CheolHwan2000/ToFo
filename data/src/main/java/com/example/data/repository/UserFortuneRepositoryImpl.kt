package com.example.data.repository

import com.example.data.local.dao.UserFortuneDao
import com.example.domain.model.UserFortune
import com.example.domain.repository.UserFortuneRepository

class UserFortuneRepositoryImpl(val dao: UserFortuneDao) : UserFortuneRepository {
    override suspend fun insertUserFortune(userFortune: UserFortune) {
        dao.insertUserFortune(com.example.data.local.entity.UserFortune(userFortune.name,userFortune.todayFortune))
    }

    override suspend fun deleteUserFortune(userFortune: UserFortune) {
        dao.deleteUserFortune()
    }
}