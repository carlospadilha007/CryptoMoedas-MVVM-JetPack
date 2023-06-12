package com.plcoding.cryptocurrencyappyt.presentation.coin_price

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.plcoding.cryptocurrencyappyt.common.Resource
import com.plcoding.cryptocurrencyappyt.presentation.use_case.get_coin_price.GetCoinPriceUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class CoinPriceViewModel @Inject constructor(
    private val getCoinPriceUseCase: GetCoinPriceUseCases
) : ViewModel() {

    private val _state = mutableStateOf(CoinPriceState())
    val state: State<CoinPriceState> = _state

    init {
        getCoins()
    }

    private fun getCoins() {
        getCoinPriceUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = CoinPriceState(coins = result.data ?: emptyList())
                }
                is Resource.Error -> {
                    _state.value = CoinPriceState(
                        error = result.message ?: "Um erro inesperado ocorreu!"
                    )
                }
                is Resource.Loading -> {
                    _state.value = CoinPriceState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }
}