package com.ms.gsk.androidarchitectureexample;

import com.compa.gsk.base.BaseApplication;
import com.ms.gsk.androidarchitectureexample.db.AppDataBase;
import com.ms.gsk.androidarchitectureexample.db.AppExecutors;

/**
 * @author IT사업부 곽성규
 * @version 1.0.0
 * @date 2018-09-05 오후 6:06
 */
public class AppInfo extends BaseApplication {

    public static AppExecutors executors;

    @Override
    public void initTag() {
        this.app_tag = getString(R.string.app_tag);
        this.db_tag = getString(R.string.db_tag);
        this.http_tag = getString(R.string.http_tag);
        this.pref_name = getString(R.string.pref_name);
        this.db_name = getString(R.string.db_name);
        this.base_url = getString(R.string.base_url);
        this.test_url = getString(R.string.test_url);
        this.api_success = getString(R.string.api_success);
        this.api_failed = getString(R.string.api_failed);
        this.api_error = getString(R.string.api_error);
        this.api_nomember = getString(R.string.api_no_member);
    }

    @Override
    public void initApp() {
        executors = new AppExecutors();
        AppDataBase.initialized();
    }

    @Override
    public void onTerminated() {

    }
}
