package com.example.dependencyinjection

import com.example.dependdencyinjection.SqlDB
import com.example.dependdencyinjection.SqlDB.FireBaseDb
import com.example.dependdencyinjection.UserRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class UserRepositoryModule {

    @Provides
   fun getFireBaseRepository():UserRepository{
       return FireBaseDb()
   }

    /**
     * In this method Dagger by default creates the 'SqlDB' object.
     * Its not required to provide as we are providing in getFireBaseRepository() manually.

      @Binds
      abstract fun getSqliteRepository(sqlDB: SqlDB):UserRepository
     */
}