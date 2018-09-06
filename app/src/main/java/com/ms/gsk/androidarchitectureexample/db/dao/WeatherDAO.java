package com.ms.gsk.androidarchitectureexample.db.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.ms.gsk.androidarchitectureexample.db.entity.WeatherEntity;

import java.util.List;

/**
 * @author IT사업부 곽성규
 * @version 1.0.0
 * @date 2018-09-05 오후 6:42
 */
@Dao
public interface WeatherDAO {

    @Query("SELECT * FROM weather")
    WeatherEntity loadAllWeathers();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(WeatherEntity weather);

}
