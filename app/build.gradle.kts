plugins {
  id("com.android.application")
  id("org.jetbrains.kotlin.android")
  kotlin("plugin.serialization") version "1.5.21"

}

android {
  namespace = "com.vatom.android_embed_sdk"
  compileSdk = 34

  defaultConfig {
    applicationId = "com.vatom.android_embed_sdk"
    minSdk = 24
    targetSdk = 33
    versionCode = 1
    versionName = "1.0"

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }

  buildTypes {
    release {
      isMinifyEnabled = false
      proguardFiles(
        getDefaultProguardFile("proguard-android-optimize.txt"),
        "proguard-rules.pro"
      )
    }
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }
  kotlinOptions {
    jvmTarget = "1.8"
  }
}

dependencies {
  implementation("com.google.code.gson:gson:2.8.8")
  implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.0")
  implementation( "com.google.code.gson:gson:2.8.8")
  implementation("pub.devrel:easypermissions:3.0.0")
  implementation ("com.google.android.gms:play-services-location:17.1.0")
  implementation("androidx.core:core-ktx:1.9.0")
  implementation("androidx.appcompat:appcompat:1.6.1")
  implementation("com.google.android.material:material:1.10.0")
  implementation("androidx.constraintlayout:constraintlayout:2.1.4")
  implementation(project(mapOf("path" to ":wallet-embedded-sdk")))
    implementation(project(mapOf("path" to ":wallet-embedded-sdk")))
    testImplementation("junit:junit:4.13.2")
  androidTestImplementation("androidx.test.ext:junit:1.1.5")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")


  project(":wallet-embedded-sdk")
}
