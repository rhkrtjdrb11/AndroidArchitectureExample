package com.ms.gsk.androidarchitectureexample.db.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * @author IT사업부 곽성규
 * @version 1.0.0
 * @date 2018-09-05 오후 6:53
 */
@Entity(tableName = "air_status")
public class AirStatusEntity {

    @PrimaryKey
    private int id;
    private String airName;
    private String grade;
    private String value;

    public AirStatusEntity(int id, String airName, String grade, String value) {
        this.id = id;
        this.airName = airName;
        this.grade = grade;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAirName() {
        return airName;
    }

    public void setAirName(String airName) {
        this.airName = airName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "AirStatusEntity{" +
                "id=" + id +
                ", airName='" + airName + '\'' +
                ", grade='" + grade + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
