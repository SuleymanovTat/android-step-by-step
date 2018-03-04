package ru.suleymanovtat.android_step_by_step.model.api;



import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by suleymanovtat on 03.03.2018.
 */

public class ApiModule {

    private static final boolean ENABLE_AUTH = false;
    private static final String AUTH_64 = "***"; //your code here


    public static ApiInterface getApiInterface() {
        Retrofit.Builder builder = new Retrofit.Builder().
                baseUrl("http://fragrant-wildflower-7647.getsandbox.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create());;
        ApiInterface apiInterface = builder.build().create(ApiInterface.class);
        return apiInterface;
    }
}
