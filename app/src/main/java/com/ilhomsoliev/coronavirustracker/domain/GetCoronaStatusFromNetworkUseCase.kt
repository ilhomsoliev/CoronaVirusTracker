package com.ilhomsoliev.coronavirustracker.domain

class GetCoronaStatusFromNetworkUseCase(private val coronaStatusRepository:CoronaStatusRepository) {

    fun getCoronaStatusFromNetwork():CoronaStatus = coronaStatusRepository.getCoronaStatusFromNetwork()

}