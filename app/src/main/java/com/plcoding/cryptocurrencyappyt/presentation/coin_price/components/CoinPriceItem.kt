package com.plcoding.cryptocurrencyappyt.presentation.coin_price.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow.Companion.Ellipsis
import androidx.compose.ui.unit.dp
import com.plcoding.cryptocurrencyappyt.presentation.coin_detail.domain.model.CoinPrice

@Composable
fun CoinPriceItem(
    coin: CoinPrice,
    onItemClick: (CoinPrice) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onItemClick(coin) }
            .padding(20.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "${coin.rank}. ${coin.name} (${coin.symbol})",
            style = MaterialTheme.typography.body2,
            overflow = Ellipsis
        )
        Text(
            text = "Ativa",
            color = Color.Green,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.End,
            style = MaterialTheme.typography.body2,
            modifier = Modifier.align(CenterVertically)
        )
    }

//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(10.dp),
//        horizontalArrangement = Arrangement.SpaceBetween
//    ) {
//        Column() {
//            Text(
//                text = "Preço",
//                style = MaterialTheme.typography.h5,
//                overflow = Ellipsis
//            )
//            Text(
//                text = "$${coin.quotes.USD.price}",
//                style = MaterialTheme.typography.h5,
//                overflow = Ellipsis
//            )
//        }
//        Column() {
//            Text(
//                text = "30m",
//                style = MaterialTheme.typography.h5,
//                overflow = Ellipsis
//            )
//            Text(
//                text = "${coin.quotes.USD.percent_change_30m}%",
//                color = if(coin.quotes.USD.percent_change_30m > 0) Color.Green else Color.Red,
//                style = MaterialTheme.typography.h5,
//                overflow = Ellipsis
//            )
//        }
//        Column() {
//            Text(
//                text = "1h",
//                style = MaterialTheme.typography.h5,
//                overflow = Ellipsis
//            )
//            Text(
//                text = "${coin.quotes.USD.percent_change_1h}%",
//                color = if(coin.quotes.USD.percent_change_1h > 0) Color.Green else Color.Red,
//                style = MaterialTheme.typography.h5,
//                overflow = Ellipsis
//            )
//        }
//        Column() {
//            Text(
//                text = "12h",
//                style = MaterialTheme.typography.h5,
//                overflow = Ellipsis
//            )
//            Text(
//                text = "${coin.quotes.USD.percent_change_12h}%",
//                color = if(coin.quotes.USD.percent_change_12h > 0) Color.Green else Color.Red,
//                style = MaterialTheme.typography.h5,
//                overflow = Ellipsis
//            )
//        }
//        Column() {
//            Text(
//                text = "24h",
//                style = MaterialTheme.typography.h5,
//                overflow = Ellipsis
//            )
//            Text(
//                text = "${coin.quotes.USD.percent_change_24h}%",
//                color = if(coin.quotes.USD.percent_change_24h > 0) Color.Green else Color.Red,
//                style = MaterialTheme.typography.h5,
//                overflow = Ellipsis
//            )
//        }
//        Column() {
//            Text(
//                text = "7d",
//                style = MaterialTheme.typography.h5,
//                overflow = Ellipsis
//            )
//            Text(
//                text = "${coin.quotes.USD.percent_change_7d}%",
//                color = if(coin.quotes.USD.percent_change_7d > 0) Color.Green else Color.Red,
//                style = MaterialTheme.typography.h5,
//                overflow = Ellipsis
//            )
//        }
//        Column() {
//            Text(
//                text = "30d",
//                style = MaterialTheme.typography.h5,
//                overflow = Ellipsis
//            )
//            Text(
//                text = "${coin.quotes.USD.percent_change_30d}%",
//                color = if(coin.quotes.USD.percent_change_30d > 0) Color.Green else Color.Red,
//                style = MaterialTheme.typography.h5,
//                overflow = Ellipsis
//            )
//        }
//        Column() {
//            Text(
//                text = "1a",
//                style = MaterialTheme.typography.h5,
//                overflow = Ellipsis
//            )
//            Text(
//                text = "${coin.quotes.USD.percent_change_1y}%",
//                color = if(coin.quotes.USD.percent_change_1y > 0) Color.Green else Color.Red,
//                style = MaterialTheme.typography.h5,
//                overflow = Ellipsis
//            )
//        }
//        Column() {
//            Text(
//                text = "Volume(24h)",
//                style = MaterialTheme.typography.h5,
//                overflow = Ellipsis
//            )
//            Text(
//                text = "$${coin.quotes.USD.volume_24h}",
//                style = MaterialTheme.typography.h5,
//                overflow = Ellipsis
//            )
//        }
//
//    }

}