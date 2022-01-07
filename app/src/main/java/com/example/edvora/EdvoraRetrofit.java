package com.example.edvora;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class EdvoraRetrofit {
    private static Retrofit retrofit;
    private static final String BASEURL = "https://assessment-edvora.herokuapp.com";
    public static Retrofit getRetrofit(){
        if (retrofit==null){
            retrofit = new Retrofit.Builder().baseUrl(BASEURL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
