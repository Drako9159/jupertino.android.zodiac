package com.drako9159.horoscoapp.motherobject

import com.drako9159.horoscoapp.data.network.response.PredictionResponse
import com.drako9159.horoscoapp.domain.model.HoroscopeInfo

object HoroscopeMotherObject {

    val anyResponse = PredictionResponse("date", "prediction", "leo")

    val horoscopeInfoList = listOf(
        HoroscopeInfo.Aries,
        HoroscopeInfo.Gemini,
        HoroscopeInfo.Cancer,
        HoroscopeInfo.Leo,
        HoroscopeInfo.Virgo,
        HoroscopeInfo.Libra,
        HoroscopeInfo.Scorpio,
        HoroscopeInfo.Capricorn,
        HoroscopeInfo.Aquarius,
        HoroscopeInfo.Pisces

    )

}