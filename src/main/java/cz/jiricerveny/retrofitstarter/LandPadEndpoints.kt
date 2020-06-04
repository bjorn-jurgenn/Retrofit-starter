package cz.jiricerveny.retrofitstarter

import retrofit2.Call
import retrofit2.http.GET

interface LandPadEndpoints {
    @GET("/v3/landpads")
    fun  getLandPads(): Call<LandPads>
}