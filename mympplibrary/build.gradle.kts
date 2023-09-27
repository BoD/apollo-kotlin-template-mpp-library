plugins {
    kotlin("multiplatform")
    id("com.apollographql.apollo3") version "4.0.0-alpha.3"
}

kotlin {
    iosSimulatorArm64("ios") {
        binaries {
            framework {
                baseName = "MyMppLibrary"
            }
        }
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("com.apollographql.apollo3:apollo-runtime")
                implementation("com.apollographql.apollo3:apollo-normalized-cache-sqlite")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

apollo {
    service("service") {
        packageName.set("com.example.mympplibrary")
    }
}
