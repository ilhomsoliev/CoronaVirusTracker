package com.ilhomsoliev.coronavirustracker.domain


import com.google.gson.annotations.SerializedName

data class CoronaStatus(
    @SerializedName("active")
    var active: Int = 0,
    @SerializedName("activePerOneMillion")
    var activePerOneMillion: Double = 0.0,
    @SerializedName("affectedCountries")
    var affectedCountries: Int = 0,
    @SerializedName("cases")
    var cases: Int = 0,
    @SerializedName("casesPerOneMillion")
    var casesPerOneMillion: Int = 0,
    @SerializedName("critical")
    var critical: Int = 0,
    @SerializedName("criticalPerOneMillion")
    var criticalPerOneMillion: Double = 0.0,
    @SerializedName("deaths")
    var deaths: Int = 0,
    @SerializedName("deathsPerOneMillion")
    var deathsPerOneMillion: Double = 0.0,
    @SerializedName("oneCasePerPeople")
    var oneCasePerPeople: Int = 0,
    @SerializedName("oneDeathPerPeople")
    var oneDeathPerPeople: Int = 0,
    @SerializedName("oneTestPerPeople")
    var oneTestPerPeople: Int = 0,
    @SerializedName("population")
    var population: Long = 0L,
    @SerializedName("recovered")
    var recovered: Int = 0,
    @SerializedName("recoveredPerOneMillion")
    var recoveredPerOneMillion: Double = 0.0,
    @SerializedName("tests")
    var tests: Long = 0L,
    @SerializedName("testsPerOneMillion")
    var testsPerOneMillion: Double = 0.0,
    @SerializedName("todayCases")
    var todayCases: Int = 0,
    @SerializedName("todayDeaths")
    var todayDeaths: Int = 0,
    @SerializedName("todayRecovered")
    var todayRecovered: Int = 0,
    @SerializedName("updated")
    var updated: Long = 0L
)