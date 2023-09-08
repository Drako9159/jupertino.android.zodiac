package com.drako9159.horoscoapp.domain.model

import com.drako9159.horoscoapp.R

sealed class HoroscopeInfo( val img:Int, val name:Int){
    object Aries:HoroscopeInfo(R.drawable.ic_horoscope, R.string.app_name)
}
