package com.ms.gsk.androidarchitectureexample.example1;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.compa.gsk.Dlog;
import com.compa.gsk.DlogHttp;
import com.compa.gsk.http.CompaRESTCallBack;
import com.compa.gsk.http.CompaRESTListener;
import com.compa.gsk.http.CompaRequest;
import com.compa.gsk.util.UtilHttp;
import com.ms.gsk.androidarchitectureexample.AppInfo;
import com.ms.gsk.androidarchitectureexample.R;
import com.ms.gsk.androidarchitectureexample.db.AirStatus;
import com.ms.gsk.androidarchitectureexample.db.AppDataBase;
import com.ms.gsk.androidarchitectureexample.db.AppExecutors;
import com.ms.gsk.androidarchitectureexample.db.REQWeather;
import com.ms.gsk.androidarchitectureexample.db.RESWeather;
import com.ms.gsk.androidarchitectureexample.db.TimeStatus;
import com.ms.gsk.androidarchitectureexample.db.WeatherInfo;
import com.ms.gsk.androidarchitectureexample.db.entity.WeatherEntity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Room Library example
 *
 * http://api.ikn.kr/whp/Weather/get_weather_info.asp
 *
 * [{"key":"sido_name","value":"서울"}]
 *
 */
public class ActExample1 extends AppCompatActivity {

    private Button btn_request;
    private Button btn_show;
    private TextView tv_response;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_example1);

        tv_response = findViewById(R.id.tv_response);
        btn_request = findViewById(R.id.btn_request);
        btn_show = findViewById(R.id.btn_show);

        final ActExampleViewModel viewModel = ViewModelProviders.of(this).get(ActExampleViewModel.class);
        getLifecycle().addObserver(viewModel);

        viewModel.getObserveWeatherData().observe(this, new Observer<WeatherEntity>() {
            @Override
            public void onChanged(@Nullable WeatherEntity weatherEntity) {
                tv_response.append(weatherEntity.toString() + "\n");
            }
        });

        btn_request.setOnClickListener((view) -> {
            viewModel.requestWeater("서울");
            finish();
        });

        btn_show.setOnClickListener((view) -> {
            AppInfo.executors.diskIO().execute(() -> {
                viewModel.loadWeatherData();

            });
        });
    }
}
