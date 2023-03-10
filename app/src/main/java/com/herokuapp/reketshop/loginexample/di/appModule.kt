package com.herokuapp.reketshop.loginexample.di

import com.herokuapp.reketshop.loginexample.data.remote.LoginApi
import com.herokuapp.reketshop.loginexample.repository.LoginRepository
import com.herokuapp.reketshop.loginexample.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object appModule {

    @Singleton
    @Provides
    fun provideLoginRepository(
        api : LoginApi
    ) = LoginRepository(api)


    @Singleton
    @Provides
    fun provideLoginApi(): LoginApi {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(LoginApi::class.java)

    }
}