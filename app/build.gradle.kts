plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.navigation.safeargs)
}

android {
    namespace = "com.jk.tourguide"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.jk.tourguide"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    signingConfigs {
        create("release") {
            storeFile = file("../key/release.jks")
            storePassword = "travelguide123@"
            keyAlias = "travelguide123@"
            keyPassword = "travelguide123@"
        }
        create("debugAndroid") {
            storeFile = file("../key/release.jks")
            storePassword = "travelguide123@"
            keyAlias = "travelguide123@"
            keyPassword = "travelguide123@"
        }
    }

    buildTypes {
        release {
            signingConfig = signingConfigs.getByName("release")
            isProfileable = true
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {
            signingConfig = signingConfigs.getByName("debugAndroid")
        }
    }
    flavorDimensions += "apiTourGuide"
    productFlavors {
        create("staging") {
            dimension = "apiTourGuide"
            buildConfigField("String", "API_BASE_URL", "\"https://www.travel.taipei/open-api/\"")
            applicationIdSuffix = ".staging"
        }
        create("prod") {
            dimension = "apiTourGuide"
            buildConfigField("String", "API_BASE_URL", "\"https://www.travel.taipei/open-api/\"")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
        viewBinding = true
        buildConfig = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }


}

//kapt {
//    correctErrorTypes = true
//}

dependencies {

    //androidX
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.compose.animation)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.annotation)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.databinding)
    implementation(libs.accompanist.pager)
    implementation(libs.accompanist.flowlayout)

    //navigation
    implementation(libs.nav.fragment)
    implementation(libs.nav.ui)

    //Coil
    implementation(libs.coil.compose.ktx)

    // Koin
    //implementation(libs.koin.compose)
    implementation(libs.koin.fragment)
    implementation(libs.koin.viewmodel)

    //kotlin coroutine
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.coroutines.core)

    //Retrofit
    implementation(libs.retrofit2.retrofit)
    implementation(libs.retrofit2.adapter)
    implementation(libs.retrofit2.scalars)
    implementation(libs.retrofit2.gson)
    implementation(libs.retrofit2.moshi)
    implementation(libs.retrofit2.coroutines)
    implementation(libs.retrofit2.okhttp)
    implementation(libs.retrofit2.interceptor)
    implementation(libs.retrofit2.serialization)
    implementation(libs.retrofit2.gson.convert)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}