package com.example.dependdencyinjection

class UserRegistrationService(private val userRepository: UserRepository,
                              private val emailService: EmailService) {

    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password)
        emailService.send("vinaytshetty@gmail.com","MandiraVinay@gmail.com","Hi Dad")
    }
}


/**
  Disadvantages of this class

   Unit Testing :- If i want to unit test 'UserRegistrationService' i need to create the instance of "UserRepository" and "EmailService" class.
   which is a bad practice.

   Single Responsibility
    Doing 2 works.
    1)Creating the instances of 'UserRepository' and 'EmailService".
    2)Register user functionality.

   Life time of these Objects
   'UserRepository' and 'EmailService' of these classes are dependent on the 'UserRegistrationService' class.

   Extensible
    Here the class are HardCoded i.e 'UserRepository' and 'EmailService'
 */