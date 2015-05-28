package com.myjobinfosample;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by tedliang on 15/5/28.
 */
public class MyJobService extends JobService {


    @Override
    public boolean onStartJob(JobParameters jobParameters) {
        //do something
        Log.d("Ted","startJob");

        return true;
    }

}
