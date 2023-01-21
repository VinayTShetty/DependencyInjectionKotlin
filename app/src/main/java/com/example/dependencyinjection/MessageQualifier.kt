package com.example.dependencyinjection

import java.lang.annotation.Documented
import javax.inject.Qualifier

@Qualifier
@Documented
@Retention(AnnotationRetention.RUNTIME)
annotation class MessageQualifier()


/**
 * Created custom annotation class for Named qualifer.
 * copied the annotation from the 'Named' class.

@Qualifier -->It used to qualify names.
@Documented-->Its is used to generate java doc.
@Retention(AnnotationRetention.RUNTIME)-->Its used to define the "TIME-LINE" of the annotaion.
 */
