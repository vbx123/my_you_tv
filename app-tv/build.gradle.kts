plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "com.ytremote.tv"
    compileSdk = 35
    defaultConfig {
        applicationId = "com.ytremote.tv"
        minSdk = 28
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"
    }
}
dependencies {
    implementation(project(":core"))
}
