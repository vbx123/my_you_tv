plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "com.ytremote.ph"
    compileSdk = 35
    defaultConfig {
        applicationId = "com.ytremote.ph"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"
    }
}
dependencies {
    implementation(project(":core"))
}
