package br.com.empresa.saudeeponto

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface RetrofitService {

    @GET("{Fruta}&pageSize=2&api_key=kxd1dCxDe2hM7vnralysUOalzijPSQxZnTLfvFHS")
    fun getFruta(@Path("Fruta") Fruta : String) : Call<Fruta>



}