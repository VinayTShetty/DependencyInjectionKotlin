package com.example.dependdencyinjection

import android.util.Log
import com.example.dependencyinjection.TAG.Companion.tag
import javax.inject.Inject

interface UserRepository {
    fun saveUser(email: String, password: String)
}

class SqlDB @Inject constructor() : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(tag, "User Saved in DB")
    }

    class FireBaseDb @Inject constructor() : UserRepository {
        override fun saveUser(email: String, password: String) {
            Log.d(tag, "User Saved in FireBase")
        }

    }
}