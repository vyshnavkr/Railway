package com.android.vyshnav.indianrailwaysimpledesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import com.android.vyshnav.indianrailwaysimpledesign.modelPnrStatus.PnrResponse;
import com.android.vyshnav.indianrailwaysimpledesign.rest.PnrApiInterface;
import com.android.vyshnav.indianrailwaysimpledesign.rest.SearchResultsApiClient;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PnrActivity extends AppCompatActivity {

    String pnrNo;
    String API_KEY;
    @BindView(R.id.tv_pnrNo)
    TextView tv_pnrNo;
    @BindView(R.id.tv_date)
    TextView tv_date;
    @BindView(R.id.tv_train_name)
    TextView tv_train_name;
    @BindView(R.id.tv_train_number)
    TextView tv_train_number;
    @BindView(R.id.tv_from)
    TextView tv_from;
    @BindView(R.id.tv_to)
    TextView tv_to;
    @BindView(R.id.tv_response_code)
    TextView tv_response_code;
    @BindView(R.id.tv_chart_prepared)
    TextView tv_chart_prepared;
    @BindView(R.id.tv_class)
    TextView tv_class;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Intent intent = getIntent();
        pnrNo = intent.getStringExtra("keyPnr");
//        API_KEY = "iqqcq8635";

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pnr);
        ButterKnife.bind(this);


        PnrApiInterface pnrApiService = SearchResultsApiClient.getClient().create(PnrApiInterface.class);
        Call<PnrResponse> call = pnrApiService.getPnrResponse("1234567890","iqqcq8635");
        call.enqueue(new Callback<PnrResponse>() {
            @Override
            public void onResponse(Call<PnrResponse> call, Response<PnrResponse> response) {

                PnrResponse jsonResponsePnr = response.body();

                int response_code = response.code();
                tv_response_code.setText("there");
                tv_chart_prepared.setText(jsonResponsePnr.getChartPrepared());
                tv_class.setText(jsonResponsePnr.getClass_());
                tv_date.setText(jsonResponsePnr.getDoj());
                tv_pnrNo.setText(jsonResponsePnr.getPnr());
                tv_train_name.setText(jsonResponsePnr.getTrainName());
                tv_train_number.setText(jsonResponsePnr.getTrainNum());
                tv_from.setText(jsonResponsePnr.getFromStation().getName());
                tv_to.setText(jsonResponsePnr.getToStation().getName());



            }

            @Override
            public void onFailure(Call<PnrResponse> call, Throwable t) {
                Log.d("Error",t.getMessage());
            }
        });
    }
}
