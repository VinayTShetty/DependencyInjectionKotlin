package com.example.dependencyinjection

import dagger.Component

@Component(modules = [UserRepositoryModule::class,NotificationServiceModule::class])
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