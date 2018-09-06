package com.ms.gsk.androidarchitectureexample.db;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;

import com.compa.gsk.base.BaseApplication;
import com.compa.gsk.util.AppContext;
import com.ms.gsk.androidarchitectureexample.db.dao.WeatherDAO;
import com.ms.gsk.androidarchitectureexample.db.entity.WeatherEntity;

import java.util.List;

/**
 * @author IT사업부 곽성규
 * @version 1.0.0
 * @date 2018-09-05 오후 6:19
 */
@Database(
        entities = {
                WeatherEntity.class
        },
        version = 1
)
public abstract class AppDataBase extends RoomDatabase {

    private static AppDataBase sInstance;
    private final MutableLiveData<Boolean> mIsDatabaseCreated = new MutableLiveData<>();

    public abstract WeatherDAO weatherDAO();

    public static void initialized() {
        if (sInstance == null) {
            synchronized (AppDataBase.class) {
                if (sInstance == null) {
                    sInstance = buildDatabase();
                    sInstance.updateDatabaseCreated();
                }
            }
        }
    }

    public static AppDataBase getInstance(){
        if(sInstance == null){
            throw new IllegalStateException("AppDataBase not initialized");
        }
        return sInstance;
    }

    private static AppDataBase buildDatabase() {
        return Room.inMemoryDatabaseBuilder(AppContext.get(), AppDataBase.class)
                .addCallback(new Callback() {
                    @Override
                    public void onCreate(@NonNull SupportSQLiteDatabase db) {
                        super.onCreate(db);
                        AppDataBase.getInstance().setDatabaseCreated();
                    }
                }).build();
    }
    private void updateDatabaseCreated() {
        if (AppContext.get().getDatabasePath(BaseApplication.db_name).exists()) {
            setDatabaseCreated();
        }
    }

    private void setDatabaseCreated(){
        mIsDatabaseCreated.postValue(true);
    }

    public LiveData<Boolean> getDatabaseCreated() {
        return mIsDatabaseCreated;
    }
}
