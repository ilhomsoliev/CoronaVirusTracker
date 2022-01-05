package com.ilhomsoliev.coronavirustracker.domain

interface CoronaStatusRepository {

    fun getCoronaStatusFromNetwork():CoronaStatus

}