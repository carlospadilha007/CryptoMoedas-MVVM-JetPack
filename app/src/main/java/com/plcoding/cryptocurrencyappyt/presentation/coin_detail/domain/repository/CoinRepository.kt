package com.plcoding.cryptocurrencyappyt.presentation.coin_detail.domain.repository

import com.plcoding.cryptocurrencyappyt.data.remote.dto.CoinDetailDto
import com.plcoding.cryptocurrencyappyt.data.remote.dto.CoinDto
import com.plcoding.cryptocurrencyappyt.data.remote.dto.CoinPriceDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto

    suspend fun getCoinPrice() : List<CoinPriceDto>
}