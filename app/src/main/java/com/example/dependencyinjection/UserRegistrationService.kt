package com.example.dependdencyinjection

import javax.inject.Inject

class UserRegistrationService @Inject constructor(private val userRepository: UserRepository, private val notificationService:NotificationService) {

    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password)
        notificationService.send("vinaytshetty@gmail.com","MandiraVinay@gamil.com","Hi Dad")
    }
}

