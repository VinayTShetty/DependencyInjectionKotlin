package com.example.dependdencyinjection

import android.util.Log
import com.example.dependencyinjection.MainActivity
import javax.inject.Inject

class EmailService @Inject constructor() {
    val TAG:String=MainActivity::class.simpleName.toString()
    fun send(to:String,from:String,body:String){
        Log.d(TAG, "Email Sent")
    }
}

/**
@Inject constructor
It will inform dagger that when ever 'EmailService' class Object is required.U can create it.
U can create 'EmailService' class via constructor injection.
 */