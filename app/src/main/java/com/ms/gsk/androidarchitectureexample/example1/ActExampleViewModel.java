package com.ms.gsk.androidarchitectureexample.example1;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.NonNull;

import com.compa.gsk.Dlog;
import com.compa.gsk.http.CompaRESTCallBack;
import com.compa.gsk.http.CompaRESTListener;
import com.compa.gsk.http.CompaRequest;
import com.compa.gsk.util.UtilHttp;
import com.ms.gsk.androidarchitectureexample.AppInfo;
import com.ms.gsk.androidarchitectureexample.R;
import com.ms.gsk.androidarchitectureexample.db.AirStatus;
import com.ms.gsk.androidarchitectureexample.db.AppDataBase;
import com.ms.gsk.androidarchitectureexample.db.REQWeather;
import com.ms.gsk.androidarchitectureexample.db.RESWeather;
import com.ms.gsk.androidarchitectureexample.db.TimeStatus;
import com.ms.gsk.androidarchitectureexample.db.WeatherInfo;
import com.ms.gsk.androidarchitectureexample.db.entity.WeatherEntity;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;

/**
 * @author IT사업부 곽성규
 * @version 1.0.0
 * @date 2018-09-06 오후 1:48
 */
public class ActExampleViewModel extends ViewModel implements LifecycleObserver {

    public MutableLiveData<WeatherEntity> observeWeatherData;
    private Call call;

    public LiveData<WeatherEntity> getObserveWeatherData(){
        if(observeWeatherData == null){
            observeWeatherData = new MutableLiveData<>();
        }
        return observeWeatherData;
    }

    public void loadWeatherData(){
        observeWeatherData.postValue(AppDataBase.getInstance().weatherDAO().loadAllWeathers());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void start(){
        Dlog.d("ActExample1.class start()");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(){
        Dlog.d("ActExample1.class onStop()");
        if(call != null){
           call.cancel();
           call = null;
        }
    }

    public void requestWeater(String sidoName){
        REQWeather reqWeather = new REQWeather();
        reqWeather.body = UtilHttp.requestBody(R.array.req_weather_params, sidoName);
        (new CompaRequest<REQWeather, RESWeather>(reqWeather)).requestQueue(new CompaRESTCallBack<RESWeather>(new CompaRESTListener<RESWeather>() {
            @Override
            public void onError(int i) {

            }

            @Override
            public void onFailure(String s) {

            }

            @Override
            public void onSuccess(RESWeather resWeather) {
                AirStatus air_status = resWeather.air_status;
                ArrayList<TimeStatus> arrayList = resWeather.time_status;
                WeatherInfo weather_info = resWeather.weather_info;
                String uv_status = resWeather.uv_status;
                String weather_ment = resWeather.weather_ment;

                WeatherEntity weatherEntity = new WeatherEntity(
                        weather_info.temperature,
                        weather_info.status,
                        weather_info.min_temperature,
                        weather_info.max_temperature,
                        weather_info.comment,
                        weather_ment,
                        uv_status
                );
                observeWeatherData.postValue(weatherEntity);

/*                AppInfo.executors.diskIO().execute(() -> {
                    AppDataBase.getInstance().runInTransaction(() -> {
                        AppDataBase.getInstance().weatherDAO().insertAll(weatherEntity);
                    });
                });*/
            }
        }));
    }
}
