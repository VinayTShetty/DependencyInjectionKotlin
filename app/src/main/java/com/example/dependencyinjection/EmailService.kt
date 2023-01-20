package com.example.dependdencyinjection

import android.util.Log

class EmailService {
    val TAG:String=EmailService::class.simpleName.toString()
    fun send(to:String,from:String,body:String){
        Log.d(TAG, "Email Sent")
    }
}