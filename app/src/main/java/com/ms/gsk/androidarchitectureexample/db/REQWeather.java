package com.ms.gsk.androidarchitectureexample.db;

import com.compa.gsk.http.RequestInfo;
import java.util.Map;
import okhttp3.RequestBody;
import retrofit2.Call;

/**
 * @author IT사업부 곽성규
 * @version 1.0.0
 * @date 2018-07-23 오후 4:23
 */
public class REQWeather extends RequestInfo {

    public Map<String, RequestBody> body;

    public REQWeather() {
    }

    @Override
    public Call getCall() {
        return (this.retrofit().create(WeatherAPI.class)).reqWeather(this.body);
    }
}
