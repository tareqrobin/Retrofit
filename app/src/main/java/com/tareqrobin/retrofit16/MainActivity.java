package com.tareqrobin.retrofit16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.widget.Toast;

import com.tareqrobin.retrofit16.networking.ApiInterface;
import com.tareqrobin.retrofit16.networking.RetrofitApiClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiInterface apiInterface=RetrofitApiClient.getRetrofit().create(ApiInterface.class);
        Call<List<Model>> call=apiInterface.getSubjectData();

        call.enqueue(new Callback<List<Model>>() {
            @Override
            public void onResponse(Call<List<Model>> call, Response<List<Model>> response) {
                List<Model> data=response.body();
                Toast.makeText(getApplicationContext(),
                        data.get(1).getMyname()+" "+data.get(1).getAge(),
                        Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<List<Model>> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"Failed",Toast.LENGTH_LONG).show();

            }
        });
    }
}
