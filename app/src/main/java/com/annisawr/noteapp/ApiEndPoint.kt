package com.annisawr.noteapp

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiEndPoint {

    @GET("data.php")
    fun data() : Call<NoteModel>

    @FormUrlEncoded
    @POST("create.php")
    fun create(
        @Field("note") note: String
    ): Call<SubmitModel>

    @FormUrlEncoded
    @POST("update.php")
    fun update(
        @Field("id") id: String,
        @Field("note") note: String
    ): Call<SubmitModel>

    @FormUrlEncoded
    @POST("delete.php")
    fun delete(
        @Field("id") id: String
    ): Call<SubmitModel>

}