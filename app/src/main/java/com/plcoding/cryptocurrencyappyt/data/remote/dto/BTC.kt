package com.plcoding.cryptocurrencyappyt.data.remote.dto

data class BTC(
    val ath_date: Any,
    val ath_price: Any,
    val market_cap: Int,
    val market_cap_change_24h: Double,
    val percent_change_12h: Double,
    val percent_change_15m: Double,
    val percent_change_1h: Double,
    val percent_change_1y: Double,
    val percent_change_24h: Double,
    val percent_change_30d: Double,
    val percent_change_30m: Double,
    val percent_change_6h: Double,
    val percent_change_7d: Double,
    val percent_from_price_ath: Any,
    val price: Double,
    val volume_24h: Double,
    val volume_24h_change_24h: Double

) {
    override fun toString(): String {
        return "BTC(ath_date=$ath_date, ath_price=$ath_price, market_cap=$market_cap, market_cap_change_24h=$market_cap_change_24h, percent_change_12h=$percent_change_12h, percent_change_15m=$percent_change_15m, percent_change_1h=$percent_change_1h, percent_change_1y=$percent_change_1y, percent_change_24h=$percent_change_24h, percent_change_30d=$percent_change_30d, percent_change_30m=$percent_change_30m, percent_change_6h=$percent_change_6h, percent_change_7d=$percent_change_7d, percent_from_price_ath=$percent_from_price_ath, price=$price, volume_24h=$volume_24h, volume_24h_change_24h=$volume_24h_change_24h)"
    }
}