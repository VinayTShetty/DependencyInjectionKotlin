package com.example.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dependdencyinjection.EmailService
import com.example.dependdencyinjection.UserRegistrationService
import com.example.dependdencyinjection.UserRepository

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userRepository =UserRepository()
        val emailService=EmailService()

        /**
         * Manual Depedency Injection,
         * Injecting the objects manually. i.e 'userRepository' and 'emailService'
         */
        val userRegistrationService=UserRegistrationService(userRepository,emailService)
        userRegistrationService.registerUser("Vinaytshetty@gmail.com","MandiraVinay")
    }
}