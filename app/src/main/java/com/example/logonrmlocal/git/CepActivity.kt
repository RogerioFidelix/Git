package com.example.logonrmlocal.git

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import api.CepService
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_cep.*
import model.CEP
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CepActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cep)

        btPesquisarcep.setOnClickListener {
            val retrofit: Retrofit = Retrofit.Builder()
                    .baseUrl("https://viacep.com.br")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

            val service: CepService = retrofit.create(CepService::class.java)
            service.buscarcep(etCep.text.toString())
                    .enqueue(object : Callback<CEP> {
                        override fun onFailure(call: Call<CEP>?, t: Throwable?){
                            Toast.makeText(this@CepActivity,
                                    "Chora não",
                                    Toast.LENGTH_SHORT).show()
                        }

                        override fun onResponse(call: Call<CEP>?, response: Response<CEP>?){
                            val cep: CEP? = response?.body()
                            tvcep.text = cep?.Cep
                        }
                    })
        }
    }
}
