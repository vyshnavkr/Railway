package com.android.vyshnav.indianrailwaysimpledesign.rest;

import com.android.vyshnav.indianrailwaysimpledesign.modelPnrStatus.PnrResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface PnrApiInterface {
    @GET("pnr_status/pnr/{pnr_no}/apikey/{apikey}/")
    Call<PnrResponse> getPnrResponse(@Path("pnr_no") String pnrNo,
                                     @Path("apikey") String apiKey);
}

