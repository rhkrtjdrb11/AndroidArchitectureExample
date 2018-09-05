package com.ms.gsk.androidarchitectureexample.db.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * @author IT사업부 곽성규
 * @version 1.0.0
 * @date 2018-09-05 오후 6:44
 */
@Entity(tableName = "weather")
public class WeatherEntity {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String temperature;
    private String status;
    private String min_temperature;
    private String max_temperature;
    private String comment;
    private String weather_ment;
    private String uv_status;
}
