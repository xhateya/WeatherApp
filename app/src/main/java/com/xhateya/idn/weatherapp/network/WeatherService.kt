package com.xhateya.idn.weatherapp.network


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import com.xhateya.idn.weatherapp.models.WeatherResponse as WeatherResponse

interface WeatherService {

    @GET("2.5/weather")
    fun getWeather(
        @Query("lat")lat: Double,
        @Query("lon")lon: Double,
        @Query("units")Units: String?,
        @Query("appid")appid: String?
    ): Call<WeatherResponse>
}