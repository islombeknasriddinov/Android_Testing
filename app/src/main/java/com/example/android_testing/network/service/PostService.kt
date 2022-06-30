package com.example.android_testing.network.service

import com.example.android_testing.model.Post
import retrofit2.http.*

interface PostService {

    @Headers(
        "Content-type:application/json"
    )

    @GET("posts")
    fun listPost(): retrofit2.Call<ArrayList<Post>>

    @DELETE("posts/{id}")
    fun deletePost(@Path("id") id: Int): retrofit2.Call<Post>

}