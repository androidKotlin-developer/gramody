package com.example.gramoday.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class UserData(
    @SerializedName("business")
    val business: Business,
    @SerializedName("countryCode")
    val countryCode: String,
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("_id")
    val id: String,
    @SerializedName("isWhatsappNum")
    val isWhatsappNum: Boolean,
    @SerializedName("language")
    val language: String,
    @SerializedName("lastContentCreationDate")
    val lastContentCreationDate: String,
    @SerializedName("lastLoginDate")
    val lastLoginDate: String,
    @SerializedName("loclevel1Name")
    val loclevel1Name: String,
    @SerializedName("loclevel2")
    val loclevel2: Int,
    @SerializedName("loclevel2Name")
    val loclevel2Name: String,
    @SerializedName("loclevel2ShortName")
    val loclevel2ShortName: String,
    @SerializedName("loclevel3")
    val loclevel3: Int,
    @SerializedName("loclevel3Name")
    val loclevel3Name: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("products")
    val products: List<Product>,
    @SerializedName("profileSlug")
    val profileSlug: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("updatedAt")
    val updatedAt: String,
    @SerializedName("userID")
    val userID: String,
    @SerializedName("userInfoRating")
    val userInfoRating: Int
) : Serializable
