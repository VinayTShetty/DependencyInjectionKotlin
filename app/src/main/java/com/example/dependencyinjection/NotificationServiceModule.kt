package com.example.dependencyinjection

import com.example.dependdencyinjection.EmailService
import com.example.dependdencyinjection.NotificationService
import dagger.Module
import dagger.Provides
@Module
class NotificationServiceModule {
    @Provides
    fun getNotificatiopnModule(): NotificationService {
        return EmailService()
    }
}