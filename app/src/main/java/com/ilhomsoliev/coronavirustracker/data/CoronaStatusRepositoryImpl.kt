package com.ilhomsoliev.coronavirustracker.data

import com.ilhomsoliev.coronavirustracker.domain.CoronaStatus
import com.ilhomsoliev.coronavirustracker.domain.CoronaStatusRepository

object CoronaStatusRepositoryImpl: CoronaStatusRepository {
    override fun getCoronaStatusFromNetwork(): CoronaStatus {
        return CoronaStatus()
    }
}