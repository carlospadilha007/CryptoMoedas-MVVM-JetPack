package com.plcoding.cryptocurrencyappyt.data.remote.dto

import com.plcoding.cryptocurrencyappyt.presentation.coin_detail.domain.model.CoinPrice

data class CoinPriceDto(
    val beta_value: Double,
    val circulating_supply: Int,
    val first_data_at: String,
    val id: String,
    val last_updated: String,
    val max_supply: Int,
    val name: String,
    val quotes: Quotes,
    val rank: Int,
    val symbol: String,
    val total_supply: Int
)
fun CoinPriceDto.toCoinPrice(): CoinPrice {
    return CoinPrice(
        id = id,
        name = name,
        quotes = quotes,
        rank = rank,
        symbol = symbol
    )
}
