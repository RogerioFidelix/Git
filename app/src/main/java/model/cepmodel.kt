package model

import com.google.gson.annotations.SerializedName

data class CEP(
        @SerializedName("cep") val Cep: String,
        @SerializedName("logradouro") val rua: String,
        @SerializedName("complemento") val cpl: String,
        @SerializedName("bairro") val bairro: String,
        @SerializedName("localidade") val cidade: String,
        @SerializedName("uf") val estado: String
)