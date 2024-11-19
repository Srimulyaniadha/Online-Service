package id.ac.polbeng.srimulyaniadha.onlineservice.services

import id.ac.polbeng.srimulyaniadha.onlineservice.models.JasaResponse
import retrofit2.Call
import retrofit2.http.GET

interface JasaService {
    @GET("services")
    fun getJasa() : Call<JasaResponse>
}
