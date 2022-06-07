package com.example.gramoday.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Translations(
    @SerializedName("en")
    val en: String,
    @SerializedName("hi")
    val hi: String
) : Serializable
