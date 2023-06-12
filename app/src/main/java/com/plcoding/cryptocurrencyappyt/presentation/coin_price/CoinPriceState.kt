package com.plcoding.cryptocurrencyappyt.presentation.coin_price

import com.plcoding.cryptocurrencyappyt.presentation.coin_detail.domain.model.CoinPrice

data class CoinPriceState(
    val isLoading: Boolean = false,
    val coins: List<CoinPrice> = emptyList(),
    val error: String = ""
)