package com.example.dependdencyinjection

import android.util.Log
import com.example.dependencyinjection.TAG.Companion.tag
import javax.inject.Inject

class UserRepository @Inject constructor(){
    fun saveUser(email: String, password: String) {
        Log.d(tag, "User Saved in DB")
    }
}