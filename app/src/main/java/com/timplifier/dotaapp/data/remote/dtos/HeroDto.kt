package com.timplifier.dotaapp.data.remote.dtos


import com.google.gson.annotations.SerializedName

data class HeroDto(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("localized_name")
    val localizedName: String,
    @SerializedName("primary_attr")
    val primaryAttr: String,
    @SerializedName("attack_type")
    val attackType: String,
    @SerializedName("roles")
    val roles: List<String>
)