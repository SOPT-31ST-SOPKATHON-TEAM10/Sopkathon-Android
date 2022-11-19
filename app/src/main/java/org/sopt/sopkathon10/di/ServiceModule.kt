package org.sopt.sopkathon10.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import org.sopt.sopkathon10.data.service.SopkathonService
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ServiceModule {
    @Singleton
    @Provides
    fun provideSopkathonService(retrofit: Retrofit): SopkathonService =
        retrofit.create(SopkathonService::class.java)
}
