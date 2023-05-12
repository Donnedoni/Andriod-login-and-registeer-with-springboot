package com.example.springboot_login;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

// the services / API interface
public interface API {

    @POST("register")
    Call<ResponseBody> createUser (
            @Body User user
    );

    @POST("login")
    Call<ResponseBody> checkUser (
            @Body User user
    );

}