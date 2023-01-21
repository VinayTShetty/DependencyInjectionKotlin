package com.example.dependdencyinjection

import javax.inject.Inject

class UserRegistrationService @Inject constructor(private val userRepository: UserRepository,
                              private val emailService: EmailService) {

    fun registerUser(email:String,password:String){

        userRepository.saveUser(email,password)
        emailService.send("vinaytshetty@gmail.com","MandiraVinay@gmail.com","Hi Dad")
    }
}

/**
    @Inject constructor
   It will inform dagger that when ever 'UserRegistrationService' class Object is required.U can create it.
 */