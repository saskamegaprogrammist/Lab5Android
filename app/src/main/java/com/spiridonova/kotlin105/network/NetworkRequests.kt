package com.spiridonova.kotlin105.network

import android.util.Log
import androidx.lifecycle.MutableLiveData
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory


public class NetworkRequests (){
    companion object {
        private const val CONNECTION = "https"
        private const val NETWORK_HOST = "api.weather.yandex.ru"
        private const val API_KEY =
            "7a8221d4-03b8-4b31-bb5f-d0786fc42af1"
    }

    val currenciesMutableLiveData: MutableLiveData<List<ForecastAPI.Forecast>? > =
        MutableLiveData<List<ForecastAPI.Forecast>?>()
    private var forecastAPI: ForecastAPI? = null
    private val okHttpClient: OkHttpClient = OkHttpClient()
        .newBuilder()
        .build()

    fun getForecast() {
        forecastAPI?.getForecast("65", "51", "ru_RU", 7, true)?.enqueue(object : Callback<ForecastAPI.Example> {
                override fun onResponse(
                    call: Call<ForecastAPI.Example>,
                    response: Response<ForecastAPI.Example>
                ) {
                    Log.d("request", call.request().url().toString())
                    currenciesMutableLiveData.postValue(response.body()?.forecasts)
                    Log.d("response", response.body()?.forecasts.toString())
                }

                override fun onFailure(call: Call<ForecastAPI.Example>, t: Throwable) {
                    Log.d("response", t.message.toString())
                }
            })
    }



    init {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(JacksonConverterFactory.create())
            .baseUrl(
                HttpUrl.Builder().scheme(CONNECTION)
                    .host(NETWORK_HOST)
                    .build()
            ).client(okHttpClient)
            .build()
        forecastAPI = retrofit.create<ForecastAPI>(ForecastAPI::class.java)
    }
}