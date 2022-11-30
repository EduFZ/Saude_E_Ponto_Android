package br.com.empresa.saudeeponto

import com.google.gson.annotations.SerializedName

data class Comida (
    @SerializedName("fdcId")            val fdcId: String,
    @SerializedName("description")      val  description: String,
    @SerializedName("nutrientId")       val nutrientId: String,
    @SerializedName("nutrientNumber")   val nutrientNumber: String
        )