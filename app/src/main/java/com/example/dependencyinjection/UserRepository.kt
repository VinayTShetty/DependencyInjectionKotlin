package com.example.dependdencyinjection

import android.util.Log

class UserRepository {
    val TAG:String=UserRepository::class.simpleName.toString()
    fun saveUser(email: String, password: String) {
        Log.d(TAG, "User Saved in DB")
    }
}