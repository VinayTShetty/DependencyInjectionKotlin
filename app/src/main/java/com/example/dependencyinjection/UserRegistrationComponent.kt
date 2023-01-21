package com.example.dependencyinjection

import com.example.dependdencyinjection.EmailService
import com.example.dependdencyinjection.UserRegistrationService
import dagger.Component

@Component
interface UserRegistrationComponent {
    /**
     * Traditional way of gettig the Object.
     * DisAdvantages :- Cannot create Mutliple objects like that.If there are more Objects.

        fun getUserRegistration():UserRegistrationService
       fun getEmaiService():EmailService

     *
     */
    fun injectfromMainActivity(mainActivity: MainActivity)
}