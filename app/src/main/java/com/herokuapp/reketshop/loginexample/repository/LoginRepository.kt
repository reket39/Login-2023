package com.herokuapp.reketshop.loginexample.repository

import com.herokuapp.reketshop.loginexample.data.remote.LoginApi
import com.herokuapp.reketshop.loginexample.data.remote.responses.UserList
import com.herokuapp.reketshop.loginexample.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class LoginRepository @Inject constructor(
    val api : LoginApi
){

    suspend fun getUserList() : Resource<UserList> {
        val response = try {
            api.getUsersList()
        } catch (e: Exception){
            return Resource.Error("Un Error Desconocido Ocurrio.")
        }
        return Resource.Success(response)
    }
}