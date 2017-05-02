package com.deepshooter.retrofitsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.deepshooter.retrofitsample.beans.ExpectedListOutput;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private OkHttpClient.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        callService();
    }


    private void callService() {
        String serviceName = "base_url";
        builder = getHttpClient();
        Retrofit retrofit = new Retrofit.Builder().baseUrl(serviceName).addConverterFactory(GsonConverterFactory.create()).client(builder.build()).build();
        GitApi gi = retrofit.create(GitApi.class);

        Call<ExpectedListOutput> call = (Call<ExpectedListOutput>) gi.getExpectedList("422ce26e-e908-4643-a2bf-2162c92ad94c");
        call.enqueue(new Callback<ExpectedListOutput>() {
            @Override
            public void onResponse(Call<ExpectedListOutput> call, Response<ExpectedListOutput> response) {
                ExpectedListOutput expectedListOutput = response.body();

                Log.e("expectedList","sucess");
            }

            @Override
            public void onFailure(Call<ExpectedListOutput> call, Throwable t) {
                Log.e("expectedList","failure");
            }

        });
    }



    public OkHttpClient.Builder getHttpClient() {
        if (builder == null) {
            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient.Builder client = new OkHttpClient.Builder();
            client.addInterceptor(loggingInterceptor);
            client.writeTimeout(60000, TimeUnit.MILLISECONDS);
            client.readTimeout(60000, TimeUnit.MILLISECONDS);
            client.connectTimeout(60000, TimeUnit.MILLISECONDS);
            return client;
        }
        return builder;
    }

}
