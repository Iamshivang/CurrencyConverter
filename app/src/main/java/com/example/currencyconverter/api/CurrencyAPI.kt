package com.example.currencyconverter.api

import com.example.currencyconverter.models.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY= "fca_live_Q9UjPumSFvBDBZWlDaRNPq6Z3sa4AtdJcM0gq2KN"

interface CurrencyAPI {

    @GET("latest?apikey=$API_KEY")
    suspend fun  getRates(
        @Query("base")
        base: String
    ): Response<CurrencyResponse>
}