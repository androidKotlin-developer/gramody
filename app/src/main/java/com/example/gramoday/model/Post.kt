package com.example.gramoday.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Post(
    @SerializedName("cmdtyID")
    val cmdtyID: String,
    @SerializedName("cmdtyStdName")
    val cmdtyStdName: String,
    @SerializedName("computed")
    val computed: Computed,
    @SerializedName("contentType")
    val contentType: String,
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("dateOfReport")
    val dateOfReport: String,
    @SerializedName("_id")
    val id: String,
    @SerializedName("loclevel2")
    val loclevel2: Int,
    @SerializedName("loclevel2ShortName")
    val loclevel2ShortName: String,
    @SerializedName("loclevel3")
    val loclevel3: Int,
    @SerializedName("loclevel3Name")
    val loclevel3Name: String,
    @SerializedName("marketID")
    val marketID: Int,
    @SerializedName("marketStdName")
    val marketStdName: String,
    @SerializedName("marketType")
    val marketType: String,
    @SerializedName("priceDetails")
    val priceDetails: List<PriceDetail>,
    @SerializedName("rawPriceConvFctr")
    val rawPriceConvFctr: Int,
    @SerializedName("rawReportPriceUnit")
    val rawReportPriceUnit: String,
    @SerializedName("rawReportPriceUnitID")
    val rawReportPriceUnitID: String,
    @SerializedName("reportID")
    val reportID: String,
    @SerializedName("updatedAt")
    val updatedAt: String
) : Serializable
