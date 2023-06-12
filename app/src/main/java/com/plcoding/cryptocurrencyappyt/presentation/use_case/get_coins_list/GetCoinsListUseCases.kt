package com.plcoding.cryptocurrencyappyt.presentation.use_case.get_coins_list

import com.plcoding.cryptocurrencyappyt.common.Resource
import com.plcoding.cryptocurrencyappyt.data.remote.dto.toCoin
import com.plcoding.cryptocurrencyappyt.data.repository.CoinRepositoryImpl
import com.plcoding.cryptocurrencyappyt.domain.model.Coin
import com.plcoding.cryptocurrencyappyt.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject


class GetCoinsListUseCases @Inject constructor(
    private val repository: CoinRepository
) {
    // Invoke permite chamer a classe como se fosse uma função
    // Flow serve para emitir multiplos valores ao longo do tempo
    // Resource é util para retorna o erro ou sucesso da requisição
    // Caso hajá dados como retorno, ele retorna uma lista de coins
    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading<List<Coin>>()) // vai ser usado na barra de progresso
            val coins = repository.getCoins().map { it.toCoin() }
            emit(Resource.Success<List<Coin>>(coins))
        } catch(e: HttpException) {
            emit(Resource.Error<List<Coin>>(e.localizedMessage ?: "Um erro inesperado aconteceu"))
        } catch(e: IOException) {
            emit(Resource.Error<List<Coin>>("Não foi possivel conectar-se ao servidor. Verifique a sua conexão de internet!!"))
        }
    }
}