package com.example.simpleretrofitlist.Retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {

    private static Retrofit retrofit;

    private final static String SERVER_URL = "http://jsonplaceholder.typicode.com"; //Así no funciona
//    private final static String SERVER_URL = "https://jsonplaceholder.typicode.com"; //Así sí funciona

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(SERVER_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
