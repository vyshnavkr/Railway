package com.android.vyshnav.indianrailwaysimpledesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.android.vyshnav.indianrailwaysimpledesign.modelTrainStatus.TrainStatusResponse;
import com.android.vyshnav.indianrailwaysimpledesign.rest.SearchResultsApiClient;
import com.android.vyshnav.indianrailwaysimpledesign.rest.TrainStatusApiInterface;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TrainStatusActivity extends AppCompatActivity {

    String TRAINNO ;
    String DATE;
    @BindView(R.id.tv_currentStatus)
    TextView tv_currentStatus;
    @BindView(R.id.tv_response_code_TS)
    TextView tv_response_code_TS;
    @BindView(R.id.tv_tnumber)
    TextView tv_tnumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Intent intent = getIntent();
        TRAINNO = intent.getStringExtra("keyTrainNo"); //if it's a string you stored.
        DATE = intent.getStringExtra("keyDateStatus"); //if it's a string you stored.

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train_status);
        ButterKnife.bind(this);

        tv_tnumber.setText(TRAINNO);


        TrainStatusApiInterface trainStatusApiService = SearchResultsApiClient.getClient().create(TrainStatusApiInterface.class);
        Call<TrainStatusResponse> call = trainStatusApiService.getTrainStatusResponse(TRAINNO,DATE,"iqqcq8635");
        call.enqueue(new Callback<TrainStatusResponse>() {
            @Override
            public void onResponse(Call<TrainStatusResponse> call, Response<TrainStatusResponse> response) {

                TrainStatusResponse jsonResponsePnr = response.body();

                int response_code = response.code();
                tv_response_code_TS.setText(String.valueOf(response_code));
                if (response_code==200){
                    tv_currentStatus.setText(jsonResponsePnr.getPosition());
                }
                if (response_code==204){
                    tv_currentStatus.setText("Empty response. Not able to fetch required data.");
                }
                if (response_code==510){
                    tv_currentStatus.setText("Train not scheduled to run on the given date.");
                }
                if (response_code==404){
                    tv_currentStatus.setText("Service Down / Source not responding");
                }


            }

            @Override
            public void onFailure(Call<TrainStatusResponse> call, Throwable t) {
                Log.d("Error","" +t.getMessage());
            }
        });
    }
}
