package com.xhateya.idn.weatherapp.models

import com.google.gson.annotations.SerializedName

data class Coord (
    @field:SerializedName("lont")
    val lon: Double,

    @field:SerializedName("lan")

    val lan: Double,

    )