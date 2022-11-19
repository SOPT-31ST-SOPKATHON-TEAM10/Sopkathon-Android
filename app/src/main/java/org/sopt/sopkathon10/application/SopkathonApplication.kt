package org.sopt.sopkathon10.application

import android.app.Application
import androidx.databinding.ktx.BuildConfig
import dagger.hilt.android.HiltAndroidApp
import org.sopt.sopkathon10.util.extensions.SopkathonDebugTree
import timber.log.Timber

@HiltAndroidApp
class SopkathonApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(SopkathonDebugTree())
        }
    }
}