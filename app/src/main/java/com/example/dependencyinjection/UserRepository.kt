package com.example.dependdencyinjection

import android.util.Log
import com.example.dependencyinjection.MainActivity
import javax.inject.Inject

class UserRepository @Inject constructor(){
    val TAG:String= MainActivity::class.simpleName.toString()
    fun saveUser(email: String, password: String) {
        Log.d(TAG, "User Saved in DB")
    }
}

/**
@Inject constructor
It will inform dagger that when ever 'UserRepository' class Object is required.U can create it.
 U can create 'UserRepository' class via constructor injection.
 */