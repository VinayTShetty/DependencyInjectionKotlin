package com.example.dependdencyinjection

import android.util.Log
import com.example.dependencyinjection.TAG.Companion.tag
import javax.inject.Inject

class EmailService @Inject constructor() {
    fun send(to:String,from:String,body:String){
        Log.d(tag, "Email Sent")
    }
}