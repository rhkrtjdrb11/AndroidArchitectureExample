package com.ms.gsk.androidarchitectureexample.db.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * @author IT사업부 곽성규
 * @version 1.0.0
 * @date 2018-09-05 오후 6:48
 */
@Entity(tableName = "time_status")
public class TimeStatusEntity {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String time;
    private String status;

    public TimeStatusEntity(int id, String time, String status) {
        this.id = id;
        this.time = time;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TimeStatusEntity{" +
                "id=" + id +
                ", time='" + time + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
