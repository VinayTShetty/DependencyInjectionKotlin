package com.example.dependdencyinjection

import com.example.dependencyinjection.MessageQualifier
import javax.inject.Inject
import javax.inject.Named

class UserRegistrationService @Inject constructor(private val userRepository: UserRepository, @MessageQualifier private val notificationService:NotificationService) {
    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password)
        notificationService.send("vinaytshetty@gmail.com","MandiraVinay@gamil.com","Hi Dad")
    }
}


/**
   @Named
  Using named qualifier to tell Dagger in the interface implementation.Which method to call.
 */


/**
@Inject constructor(private val userRepository: UserRepository, @Named("messsage") private val notificationService:NotificationService)

Replace the above code as below with annotation @MessageQualifier

class UserRegistrationService @Inject constructor(private val userRepository: UserRepository, @MessageQualifier private val notificationService:NotificationService)
 */