package com.timplifier.dotaapp.data.remote.apis

import com.timplifier.dotaapp.common.constants.Constants.HEROES_FETCH
import com.timplifier.dotaapp.data.remote.dtos.HeroDto
import retrofit2.http.GET

interface HeroesApiService {

    @GET(HEROES_FETCH)
    suspend fun fetchHeroes(): List<HeroDto>
}