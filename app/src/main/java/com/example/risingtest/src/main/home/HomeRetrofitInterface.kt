package com.example.risingtest.src.main.home

import com.softsquared.template.kotlin.src.main.home.models.PostSignUpRequest
import com.softsquared.template.kotlin.src.main.home.models.SignUpResponse
import com.softsquared.template.kotlin.src.main.home.models.UserResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface HomeRetrofitInterface {
    @GET("/template/users")
    fun getUsers() : Call<UserResponse>

    @POST("/template/users")
    fun postSignUp(@Body params: PostSignUpRequest): Call<SignUpResponse>
}
