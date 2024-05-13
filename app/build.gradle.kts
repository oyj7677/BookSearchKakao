plugins {
    id(Plugins.ANDROID_APPLICATION)
    id(Plugins.KOTLIN_ANDROID)
    id(Plugins.KAPT)
    id(Plugins.SECRETS_GRADLE_PLUGIN)
    id(Plugins.SAFEARGS)
    id(Plugins.PARCELIZE)
    id(Plugins.HILT_PLUGIN)
}

android {
    namespace = "com.example.booksearchapp"
    compileSdk = DefaultConfig.COMPILE_SDK_VERSION

    defaultConfig {
        applicationId = "com.example.booksearchapp"
        minSdk = DefaultConfig.MIN_SDK_VERSION
        targetSdk = DefaultConfig.TARGET_SDK_VERSION
        versionCode = DefaultConfig.VERSION_CODE
        versionName = DefaultConfig.VERSION_NAME

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        viewBinding = true
        buildConfig = true
    }

    kapt {
        correctErrorTypes = true
    }
}

dependencies {

    implementation(Dependencies.coreKtx)
    implementation(Dependencies.appCompat)
    implementation(Dependencies.material)
    implementation(Dependencies.constraintLayout)

    // Retrofit
    implementation(Dependencies.retrofit)
    implementation(Dependencies.retrofitConverterMoshi)

    // Moshi
    implementation(Dependencies.moshi)
    kapt(Dependencies.moshiKapt)

    // OKhttp
    implementation(Dependencies.okhttp)
    implementation(Dependencies.okhttpLoggingInterceptor)

    // Lifecycle
    implementation(Dependencies.lifecycleViewmodelKtx)
    implementation(Dependencies.lifecycleRuntimeKtx)
    implementation(Dependencies.lifecycleViewmodelSavedstate)

    // Coroutines
    implementation(Dependencies.coroutinesCore)
    implementation(Dependencies.coroutinesAndroid)

    // Coil
    implementation(Dependencies.coil)

    // RecyclerView
    implementation(Dependencies.recyclerview)

    // Navigation
    implementation(Dependencies.navigationFragementKtx)
    implementation(Dependencies.navigationUiKtx)

    // Room
    implementation(Dependencies.roomRuntime)
    implementation(Dependencies.roomKtx)
    kapt(Dependencies.roomKapt)
    implementation(Dependencies.roomPaging)

    // Kotlin serialization
    implementation(Dependencies.kotlinSerialization)

    // DataStore
    implementation(Dependencies.preferencesDatastore)

    // Paging
    implementation(Dependencies.paging)

    // WorkManager
    implementation(Dependencies.workmanager)

    // Dagger Hilt
    implementation(Dependencies.daggerHilt)
    kapt(Dependencies.daggerHiltKapt)

    // Hilt extensions
    implementation(Dependencies.hiltExtensionWork)
    kapt(Dependencies.hitlExtensionKapt)

    // ViewModel delegate
    implementation(Dependencies.activityKtx)
    implementation(Dependencies.fragmentKtx)

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}