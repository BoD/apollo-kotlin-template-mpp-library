plugins {
    kotlin("multiplatform") version "1.7.0" apply false
}

buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
        google()
    }
}


allprojects {
    group = "com.example"
    version = "1.0.0"

    repositories {
        mavenLocal()
        mavenCentral()
        google()
    }
}

// The library is compiled into an iOS Framework and linked when running the iOS app, via the :mympplibrary:embedAndSignAppleFrameworkForXcode task
// See https://blog.jetbrains.com/kotlin/2021/07/multiplatform-gradle-plugin-improved-for-connecting-kmm-modules/
