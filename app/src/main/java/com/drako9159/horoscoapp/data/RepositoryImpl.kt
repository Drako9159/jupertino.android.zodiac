package com.drako9159.horoscoapp.data

import android.util.Log
import com.drako9159.horoscoapp.data.network.HoroscopeApiService
import com.drako9159.horoscoapp.domain.Repository
import com.drako9159.horoscoapp.domain.model.PredictionModel
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {
    override suspend fun getPrediction(sign: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("Fail Api", "Error ${it.message}") }
        return null
    }
}