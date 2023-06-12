package com.plcoding.cryptocurrencyappyt.presentation.use_case.get_coin_price

import com.plcoding.cryptocurrencyappyt.common.Resource
import com.plcoding.cryptocurrencyappyt.data.remote.dto.toCoinPrice
import com.plcoding.cryptocurrencyappyt.presentation.coin_detail.domain.model.CoinPrice
import com.plcoding.cryptocurrencyappyt.presentation.coin_detail.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject


class GetCoinPriceUseCases @Inject constructor(
    private val repository: CoinRepository
) {
    // Invoke permite chamer a classe como se fosse uma função
    // Flow serve para emitir multiplos valores ao longo do tempo
    // Resource é util para retorna o erro ou sucesso da requisição
    // Caso hajá dados como retorno, ele retorna uma lista de coins
    operator fun invoke(): Flow<Resource<List<CoinPrice>>> = flow {
        try {
            emit(Resource.Loading<List<CoinPrice>>()) // vai ser usado na barra de progresso
            val coinsPrice = repository.getCoinPrice().map { it.toCoinPrice() }
            emit(Resource.Success<List<CoinPrice>>(coinsPrice))
        } catch(e: HttpException) {
            emit(Resource.Error<List<CoinPrice>>(e.localizedMessage ?: "Um erro inesperado aconteceu"))
        } catch(e: IOException) {
            emit(Resource.Error<List<CoinPrice>>("Não foi possivel conectar ao servidor, verifique a sua conexão de internet!"))
        }
    }
}