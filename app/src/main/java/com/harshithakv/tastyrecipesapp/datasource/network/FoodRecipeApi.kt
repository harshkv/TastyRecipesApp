package com.harshithakv.tastyrecipesapp.datasource.network

import com.harshithakv.tastyrecipesapp.dto.FoodRecipe
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface FoodRecipeApi {

    @GET("recipes/complexSearch")
    suspend fun getRecipes(
       @QueryMap queries:Map<String, String>
    ): Response<FoodRecipe>
}