plugins {
    kotlin("multiplatform")
    id("com.apollographql.apollo3") version "3.3.2"
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
                implementation("com.apollographql.apollo3:apollo-runtime:3.3.2")
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
