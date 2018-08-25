package api


import model.CEP
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CepService{
    @GET("/ws/{cep}/json")
    fun buscarcep(@Path("cep") cep: String) : Call<CEP>
}