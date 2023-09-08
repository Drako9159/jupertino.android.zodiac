package com.drako9159.horoscoapp.domain.model

import com.drako9159.horoscoapp.R

sealed class HoroscopeInfo( val img:Int, val name:Int){
    data object Aries:HoroscopeInfo(R.drawable.ic_aries, R.string.aries)
    data object Taurus:HoroscopeInfo(R.drawable.ic_taurus, R.string.taurus)
    data object Gemini:HoroscopeInfo(R.drawable.ic_gemini, R.string.gemini)
    data object Cancer:HoroscopeInfo(R.drawable.ic_cancer, R.string.cancer)
    data object Leo:HoroscopeInfo(R.drawable.ic_leo, R.string.leo)
    data object Virgo:HoroscopeInfo(R.drawable.ic_virgo, R.string.virgo)
    data object Libra:HoroscopeInfo(R.drawable.ic_libra, R.string.libra)
    data object Scorpio:HoroscopeInfo(R.drawable.ic_scorpio, R.string.scorpio)
    data object Sagittarius:HoroscopeInfo(R.drawable.ic_sagittarius, R.string.sagittarius)
    data object Capricorn:HoroscopeInfo(R.drawable.ic_capricorn, R.string.capricorn)
    data object Aquarius:HoroscopeInfo(R.drawable.ic_acuarius, R.string.aquarius)
    data object Pisces:HoroscopeInfo(R.drawable.ic_pisces, R.string.pisces)
}
