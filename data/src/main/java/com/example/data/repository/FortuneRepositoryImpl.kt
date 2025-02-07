package com.example.data.repository

import com.example.data.local.dao.FortuneDao
import com.example.domain.model.Fortune
import com.example.domain.repository.FortuneRepository
import javax.inject.Inject

class FortuneRepositoryImpl @Inject constructor(private val dao: FortuneDao) : FortuneRepository {
    override suspend fun insertFortune(fortune: Fortune) {
        dao.insertFortune(com.example.data.local.entity.Fortune(fortune.fortuneNo,fortune.fortune))
    }

    override suspend fun deleteFortune(fortune: Fortune) {
        dao.deleteFortune()
    }


}