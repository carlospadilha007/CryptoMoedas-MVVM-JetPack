package com.plcoding.cryptocurrencyappyt.presentation.coin_detail.domain.model

import com.plcoding.cryptocurrencyappyt.data.remote.dto.Quotes

data class CoinPrice(
    val id: String,
    val name: String,
    val quotes: Quotes,
    val rank: Int,
    val symbol: String,

)

