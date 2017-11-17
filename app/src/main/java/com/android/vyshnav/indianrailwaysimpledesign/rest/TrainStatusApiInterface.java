package com.android.vyshnav.indianrailwaysimpledesign.rest;

import com.android.vyshnav.indianrailwaysimpledesign.modelTrainStatus.TrainStatusResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface TrainStatusApiInterface {
    @GET("live/train/{train_number}/doj/{date}/apikey/{apikey}/")
    Call<TrainStatusResponse> getTrainStatusResponse(@Path("train_number") String train_number,
                                                   @Path("date") String date,
                                                   @Path("apikey") String apiKey);
}
