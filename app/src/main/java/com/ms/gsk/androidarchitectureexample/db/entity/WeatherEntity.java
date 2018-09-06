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
    private String minTemperature;
    private String maxTemperature;
    private String comment;
    private String weatherMent;
    private String uvStatus;

    public WeatherEntity(String temperature, String status, String minTemperature, String maxTemperature, String comment, String weatherMent, String uvStatus) {
        this.temperature = temperature;
        this.status = status;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
        this.comment = comment;
        this.weatherMent = weatherMent;
        this.uvStatus = uvStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(String minTemperature) {
        this.minTemperature = minTemperature;
    }

    public String getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(String maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getWeatherMent() {
        return weatherMent;
    }

    public void setWeatherMent(String weatherMent) {
        this.weatherMent = weatherMent;
    }

    public String getUvStatus() {
        return uvStatus;
    }

    public void setUvStatus(String uvStatus) {
        this.uvStatus = uvStatus;
    }

    @Override
    public String toString() {
        return "WeatherEntity{" +
                "id=" + id +
                ", temperature='" + temperature + '\'' +
                ", status='" + status + '\'' +
                ", minTemperature='" + minTemperature + '\'' +
                ", maxTemperature='" + maxTemperature + '\'' +
                ", comment='" + comment + '\'' +
                ", weatherMent='" + weatherMent + '\'' +
                ", uvStatus='" + uvStatus + '\'' +
                '}';
    }
}
