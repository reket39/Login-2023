package com.herokuapp.reketshop.loginexample.data.remote.responses

data class UserListItem(
    val created_at: String,
    val email: String,
    val email_confirmed: Boolean,
    val id: String,
    val image: String,
    val is_avaliable: Boolean,
    val password: String,
    val phone: Int,
    val r_token: String,
    val session_token: String,
    val updated_at: String,
    val username: String
)