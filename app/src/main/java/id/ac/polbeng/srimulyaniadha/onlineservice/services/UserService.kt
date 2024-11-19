package id.ac.polbeng.srimulyaniadha.onlineservice.services

import id.ac.polbeng.srimulyaniadha.onlineservice.models.LoginResponse
import id.ac.polbeng.srimulyaniadha.onlineservice.models.DefaultResponse
import id.ac.polbeng.srimulyaniadha.onlineservice.models.User
import retrofit2.Call
import retrofit2.http.*

interface UserService {
    @GET("login")
    fun loginUser(
        @QueryMap filter: HashMap<String, String>
    ): Call<LoginResponse>

    @POST("users")
    fun registerUser(
        @Body newUser: User
    ): Call<DefaultResponse>

    @PUT("users")
    fun updateUser(
        @Body updatedUser: User
    ): Call<DefaultResponse>
}