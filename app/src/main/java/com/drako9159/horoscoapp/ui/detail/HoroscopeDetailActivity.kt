package com.drako9159.horoscoapp.ui.detail

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.navArgs
import com.drako9159.horoscoapp.R
import com.drako9159.horoscoapp.databinding.ActivityHoroscopeDetailBinding
import com.drako9159.horoscoapp.domain.model.HoroscopeModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HoroscopeDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHoroscopeDetailBinding
    private val horoscopeDetailViewModel: HoroscopeDetailViewModel by viewModels()

    private val args: HoroscopeDetailActivityArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHoroscopeDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //args.type
        horoscopeDetailViewModel.getHoroscope(args.type)
        initUI()
    }

    private fun initUI() {
        initListeners()
        initUIState()
    }

    private fun initListeners() {
        binding.ivBack.setOnClickListener { onBackPressed() }
    }

    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                horoscopeDetailViewModel.state.collect {
                    when (it) {
                        is HoroscopeDetailState.Error -> errorState()
                        HoroscopeDetailState.Loading -> loadingState()
                        is HoroscopeDetailState.Success -> successState(it)
                    }
                }
            }
        }
    }

    private fun loadingState() {
        binding.pb.isVisible = true
    }

    private fun errorState() {
        binding.pb.isVisible = false
    }

    private fun successState(state: HoroscopeDetailState.Success) {
        binding.pb.isVisible = false
        binding.tvTitle.text = state.sign
        binding.tvBody.text = state.prediction

        val image = when (state.horoscopeModel) {
            HoroscopeModel.Aries -> R.drawable.ic_aries
            HoroscopeModel.Taurus -> R.drawable.ic_taurus
            HoroscopeModel.Gemini -> R.drawable.ic_gemini
            HoroscopeModel.Cancer -> R.drawable.ic_cancer
            HoroscopeModel.Leo -> R.drawable.ic_leo
            HoroscopeModel.Virgo -> R.drawable.ic_virgo
            HoroscopeModel.Libra -> R.drawable.ic_libra
            HoroscopeModel.Scorpio -> R.drawable.ic_scorpio
            HoroscopeModel.Sagittarius -> R.drawable.ic_sagittarius
            HoroscopeModel.Capricorn -> R.drawable.ic_capricorn
            HoroscopeModel.Aquarius -> R.drawable.ic_acuarius
            HoroscopeModel.Pisces -> R.drawable.ic_pisces
        }
        binding.ivDetail.setImageResource(image)
    }
}