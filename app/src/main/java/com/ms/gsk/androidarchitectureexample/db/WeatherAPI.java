package com.ms.gsk.androidarchitectureexample.db;

import java.util.Map;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PartMap;

/**
 * @author IT사업부 곽성규
 * @version 1.0.0
 * @date 2018-07-10 오후 5:27
 */
public interface WeatherAPI {

    @Multipart
    @POST("Weather/get_weather_info.asp")
    Call<RESWeather> reqWeather(@PartMap Map<String, RequestBody> body);
}

