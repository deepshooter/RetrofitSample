package com.deepshooter.retrofitsample;

import com.deepshooter.retrofitsample.beans.ExpectedListOutput;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;



public interface GitApi {

     //@GET("v1/public/yql")
    //Call<WeatherOutput> getWeather(@Query(value = "q",encoded = true) String query, @Query("format") String format);

    //@POST("security/association/{Id}/deliveries/expected/list")
    //Call<ExpectedListOutput> getExpectedList(@Body  String id);

    @GET("security/association/{Id}/deliveries/expected/list")
    Call<ExpectedListOutput> getExpectedList(@Path("Id") String id);

}