package com.example.edvora;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EdvoraInterface {
    @GET("/")
    Call<List<EdvoraModekl>> getEdvora();
}
