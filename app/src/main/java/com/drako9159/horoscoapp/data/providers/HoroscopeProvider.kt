package com.drako9159.horoscoapp.data.providers

import com.drako9159.horoscoapp.domain.model.HoroscopeInfo
import javax.inject.Inject

class HoroscopeProvider @Inject constructor() {
    fun getHoroscopes(): List<HoroscopeInfo> {
        return listOf(
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
}