package com.drako9159.horoscoapp.data.network.response

import com.drako9159.horoscoapp.domain.model.HoroscopeModel
import com.drako9159.horoscoapp.motherobject.HoroscopeMotherObject
import io.kotlintest.shouldBe
import org.junit.Assert.*
import org.junit.Test
import kotlin.math.sign

class PredictionResponseTest{

    @Test
    fun `toDomain should return a correct PredictionModel`(){
        //Given
        val horoscopeResponse = HoroscopeMotherObject.anyResponse.copy(sign = "taurus")

        //When
        val predictionModel = horoscopeResponse.toDomain()

        //Then
        predictionModel.sign shouldBe horoscopeResponse.sign
        predictionModel.horoscope shouldBe horoscopeResponse.horoscope
    }
}