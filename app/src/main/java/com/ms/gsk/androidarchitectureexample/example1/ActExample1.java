package com.ms.gsk.androidarchitectureexample.example1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.ms.gsk.androidarchitectureexample.R;
import com.ms.gsk.androidarchitectureexample.db.AppDataBase;

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

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_example1);

    }
}
