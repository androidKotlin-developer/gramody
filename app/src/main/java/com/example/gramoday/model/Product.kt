package com.example.gramoday.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Product(
    @SerializedName("cmdtyID")
    val cmdtyID: String,
    @SerializedName("cmdtySegment")
    val cmdtySegment: String,
    @SerializedName("cmdtyStdName")
    val cmdtyStdName: String,
    @SerializedName("picUrl")
    val picUrl: String,
    @SerializedName("posts")
    val posts: List<Post>,
    @SerializedName("sortOrder")
    val sortOrder: Int,
    @SerializedName("translations")
    val translations: Translations
) : Serializable
