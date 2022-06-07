package com.harshithakv.tastyrecipesapp.datasource

import com.harshithakv.tastyrecipesapp.datasource.network.FoodRecipeApi
import com.harshithakv.tastyrecipesapp.dto.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipeApi: FoodRecipeApi
) {

    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe> {
        return foodRecipeApi.getRecipes(queries)
    }
}