package com.tareqrobin.retrofit16.networking;

import com.tareqrobin.retrofit16.Model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("api")
    Call<List<Model>> getSubjectData();
}
