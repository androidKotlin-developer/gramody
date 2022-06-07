package com.example.gramoday.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Business(
    @SerializedName("businessTypeId")
    val businessTypeId: Int,
    @SerializedName("category")
    val category: String,
    @SerializedName("firmName")
    val firmName: String,
    @SerializedName("mandiShopnum")
    val mandiShopnum: String,
    @SerializedName("marketID")
    val marketID: Int,
    @SerializedName("marketStdName")
    val marketStdName: String,
    @SerializedName("userID")
    val userID: String,
    @SerializedName("userOption")
    val userOption: String,
    @SerializedName("verificationStatus")
    val verificationStatus: String
) : Serializable
