package com.example.gramoday.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Computed(
    @SerializedName("highestAvgPriceVarietyGrade")
    val highestAvgPriceVarietyGrade: HighestAvgPriceVarietyGrade
) : Serializable
