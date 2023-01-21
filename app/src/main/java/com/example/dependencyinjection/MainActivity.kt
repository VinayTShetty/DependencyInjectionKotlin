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


        /**
         * Manual Depedency Injection,
         * Injecting the objects manually. i.e 'userRepository' and 'emailService'
         */
      /*
       val userRepository =UserRepository()
       val emailService=EmailService()
       val userRegistrationService=UserRegistrationService(userRepository,emailService)
        userRegistrationService.registerUser("Vinaytshetty@gmail.com","MandiraVinay")*/

        //Using Dagger Dependency injection.
        val component=DaggerUserRegistrationComponent.builder().build()

        val userRegistrationService=component.getuserRegistration()
        userRegistrationService.registerUser("Vinaytshetty@gmail.com","MandiraVinay")

        val emailService=component.getEmailService()
        emailService.send("Vinaytshetty@gmail.com","MandiraVinay@gmail.com","Hi Dad")
    }
}
