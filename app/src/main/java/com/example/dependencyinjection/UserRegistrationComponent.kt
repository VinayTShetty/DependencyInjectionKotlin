package com.example.dependencyinjection
import com.example.dependdencyinjection.EmailService
import com.example.dependdencyinjection.UserRegistrationService
import dagger.Component

@Component
interface UserRegistrationComponent {
        fun getuserRegistration():UserRegistrationService
        fun getEmailService():EmailService
}


/**
 * @Component
 * It will generate the Required Objects necessary for the Depedency Injection.
 * How many objects are required for the dependency injection ,those classes will be created

   After Building the project
  Dagger will generate the class DagggerUserRegistrationComponent class which will implement the methods userRegistration.

 */