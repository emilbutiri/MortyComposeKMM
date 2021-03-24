buildscript {
    repositories {
        google()
        mavenCentral()
        jcenter()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}")
        classpath("com.android.tools.build:gradle:7.0.0-alpha11")
        classpath("com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}")
        classpath("com.apollographql.apollo:apollo-gradle-plugin:${Versions.apollo}")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        jcenter()
    }
}