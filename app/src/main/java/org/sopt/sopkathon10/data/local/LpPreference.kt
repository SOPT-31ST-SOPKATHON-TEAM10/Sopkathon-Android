package org.sopt.sopkathon10.data.local

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit
import androidx.databinding.ktx.BuildConfig
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LpPreference @Inject constructor(@ApplicationContext context: Context) {
    private val masterKey = MasterKey.Builder(context, MasterKey.DEFAULT_MASTER_KEY_ALIAS)
        .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
        .build()

    private val dataStore: SharedPreferences =
        if (BuildConfig.DEBUG) context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE)
        else EncryptedSharedPreferences.create(
            context,
            FILE_NAME,
            masterKey,
            EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
            EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
        )

    var nickname: String
    set(value) = dataStore.edit { putString(PREF_USER_NICKNAME, value) }
    get() = dataStore.getString(PREF_USER_NICKNAME, "") ?: ""

    companion object {
        private const val FILE_NAME = "listeningPresent"
        private const val PREF_USER_NICKNAME = "userNickname"
    }
}