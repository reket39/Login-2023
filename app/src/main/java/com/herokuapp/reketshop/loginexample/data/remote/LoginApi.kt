package com.herokuapp.reketshop.loginexample.data.remote

import com.herokuapp.reketshop.loginexample.data.remote.responses.UserList

import retrofit2.http.GET

interface LoginApi {

    @GET("getAll")
    suspend fun getUsersList(): UserList
}