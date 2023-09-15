package com.drako9159.horoscoapp.ui.horoscope

import com.drako9159.horoscoapp.data.providers.HoroscopeProvider
import com.drako9159.horoscoapp.motherobject.HoroscopeMotherObject.horoscopeInfoList
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.impl.annotations.MockK
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class HoroscopeViewModelTest {

    @MockK
    lateinit var horoscopeProvider: HoroscopeProvider

    private lateinit var viewModel: HoroscopeViewModel

    // Before tests for two logic
    @Before
    fun setUp() {
        MockKAnnotations.init(this, relaxUnitFun = true)
    }

    @Test
    fun `when view model is created the horoscope are loaded`() {
        coEvery { horoscopeProvider.getHoroscopes() } returns horoscopeInfoList
        viewModel = HoroscopeViewModel(horoscopeProvider)

        val horoscopes = viewModel.horoscope.value

        assertTrue(horoscopes.isNotEmpty())
    }
}