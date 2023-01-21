package com.example.dependdencyinjection

import android.util.Log
import com.example.dependencyinjection.TAG.Companion.tag
import javax.inject.Inject

interface NotificationService{
    fun send(from: String,to: String,body: String)
}

class EmailService @Inject constructor():NotificationService {
    override fun send(to:String, from:String, body:String){
        Log.d(tag, "Email Sent")
    }
}

class MessageService @Inject constructor():NotificationService{
    override fun send(from: String, to: String, body: String) {
        Log.d(tag, "Message Sent")
    }
}