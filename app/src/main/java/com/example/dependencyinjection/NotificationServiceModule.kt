package com.example.dependencyinjection

import com.example.dependdencyinjection.EmailService
import com.example.dependdencyinjection.MessageService
import com.example.dependdencyinjection.NotificationService
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {
    @Provides
    fun getNotificatiopnModule(emailService: EmailService): NotificationService {
        return EmailService()
    }

    /**
     * Adding a named annotation to make
     */
    @Named("messsage")
    @Provides
    fun getMessageService(messageService: MessageService): NotificationService {
        return MessageService()
    }
}

/**
@Named
Using named qualifier to tell Dagger in the interface implementation.Which method to call.
 Disadvantae:- Type mistake can be possible if we used static typed annotation.
 */
