package com.example.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dependdencyinjection.EmailService
import com.example.dependdencyinjection.UserRegistrationService
import com.example.dependdencyinjection.UserRepository
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService
    @Inject
    lateinit var emailService: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component=DaggerUserRegistrationComponent.builder().build()
        component.injectfromMainActivity(this)
        userRegistrationService.registerUser("vinaytshetty@gmail.com","123456")
        emailService.send("vinaytshetty@gmail.com","mandiravinay@gmail.com","Happy Mandira")
    }
}