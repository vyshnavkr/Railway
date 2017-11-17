package com.android.vyshnav.indianrailwaysimpledesign.rest;

import com.android.vyshnav.indianrailwaysimpledesign.modelSearchTrain.SearchResultsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface SearchResultsApiInterface {
    @GET("between/source/{source_station_code}/dest/{dest_station_code}/date/{dd_mm}/apikey/{apikey}/")
    Call<SearchResultsResponse> getTrainNameResponse(@Path("source_station_code") String source_station_code,
                                                     @Path("dest_station_code") String dest_station_code,
                                                     @Path("dd_mm") String dd_mm,
                                                     @Path("apikey") String apiKey);
}
