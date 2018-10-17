package com.tareqrobin.retrofit16.networking;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitApiClient {
    public static final String BASE_URL="http://atatikurrahman.000webhostapp.com/";

    private static Retrofit retrofit=null;

    public static Retrofit getRetrofit(){
        if (retrofit==null){
            retrofit=new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
    return retrofit;
    }

}