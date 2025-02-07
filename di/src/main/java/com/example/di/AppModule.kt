package com.example.di

import android.content.Context
import androidx.room.Room
import com.example.data.local.dao.FortuneDao
import com.example.data.local.dao.UserFortuneDao
import com.example.data.local.database.MainDatabase
import com.example.data.repository.FortuneRepositoryImpl
import com.example.data.repository.UserFortuneRepositoryImpl
import com.example.domain.repository.FortuneRepository
import com.example.domain.repository.UserFortuneRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideFortuneRepository(fortuneDao: FortuneDao) : FortuneRepository {
        return FortuneRepositoryImpl(fortuneDao)
    }
    @Provides
    @Singleton
    fun provideUserFortuneRepository(userFortuneDao: UserFortuneDao) : UserFortuneRepository {
        return UserFortuneRepositoryImpl(userFortuneDao)
    }

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context) : MainDatabase{
        return Room.databaseBuilder(
            context,
            MainDatabase::class.java,
            "main_database"
        ).build()
    }

    @Provides
    fun provideFortuneDao(database: MainDatabase) : FortuneDao{
        return database.fortuneDao()
    }

    @Provides
    fun provideUserFortuneDao(database: MainDatabase) : UserFortuneDao{
        return database.userFortuneDao()
    }

}