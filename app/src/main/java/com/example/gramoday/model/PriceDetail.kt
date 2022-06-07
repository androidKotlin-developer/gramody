package com.example.gramoday.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class PriceDetail(
    @SerializedName("arrivalTotal")
    val arrivalTotal: Int,
    @SerializedName("defaultGrade")
    val defaultGrade: Boolean,
    @SerializedName("defaultVariety")
    val defaultVariety: Boolean,
    @SerializedName("gradeDescr")
    val gradeDescr: String,
    @SerializedName("gradeID")
    val gradeID: String,
    @SerializedName("gradeName")
    val gradeName: String,
    @SerializedName("_id")
    val id: String,
    @SerializedName("maxPrice")
    val maxPrice: Int,
    @SerializedName("minPrice")
    val minPrice: Int,
    @SerializedName("varietyID")
    val varietyID: String,
    @SerializedName("varietyName")
    val varietyName: String
): Serializable
