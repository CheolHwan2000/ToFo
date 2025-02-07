package com.example.domain.repository

import com.example.domain.model.Fortune

interface FortuneRepository {
    suspend fun insertFortune(fortune: Fortune)
    suspend fun deleteFortune(fortune: Fortune)
}