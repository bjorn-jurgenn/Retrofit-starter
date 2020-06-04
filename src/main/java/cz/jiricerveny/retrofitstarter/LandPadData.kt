package cz.jiricerveny.retrofitstarter

import android.graphics.Region


data class LandPads(
    val results: List<Result>
)

data class Result(
    val id: String,
    val full_name: String,
    val status: String,
    val location: ResultLocation,
    val landing_type: String,
    val successful_landings: Int,
    val attempted_landings: Int,
    val wikipedia: String,
    val details: String
)

data class ResultLocation(
    val name: String,
    val region: String,
    val latitude: Long,
    val longitude: Long
)