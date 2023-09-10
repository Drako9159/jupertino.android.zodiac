package com.drako9159.horoscoapp.domain

import com.drako9159.horoscoapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign: String): PredictionModel?

}