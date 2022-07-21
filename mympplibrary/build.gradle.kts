plugins {
    kotlin("multiplatform")
    id("com.apollographql.apollo3") version "3.4.1-SNAPSHOT"
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
    packageName.set("com.example.mympplibrary")
}
