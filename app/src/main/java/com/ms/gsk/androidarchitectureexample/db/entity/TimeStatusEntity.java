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
}
