package com.android.vyshnav.indianrailwaysimpledesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;

import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TrainStatusDialogActivty extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {


    @BindView(R.id.sb_TS)
    Button sb_TS;
    @BindView(R.id.et_train_no)
    EditText et_train_no;
    @BindView(R.id.tv_dp_TS)
    TextView tv_dp_TS;
    String date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train_status_dialog_activty);
    }

    public void searchResults(View view){
        ButterKnife.bind(this);
        Intent myIntent = new Intent(TrainStatusDialogActivty.this, TrainStatusActivity.class);
        myIntent.putExtra("keyTrainNo", et_train_no.getText().toString()); //Optional parameters
        myIntent.putExtra("keyDateStatus", date);
        TrainStatusDialogActivty.this.startActivity(myIntent);
    }
    @Override
    public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {

        String m = String.format("%02d", monthOfYear+1);
        String d = String.format("%02d", dayOfMonth);
        String y = (String.valueOf(year));
        date = y + m + d;
        tv_dp_TS.setText(date);
    }

    public void pickDate(View view) {
        ButterKnife.bind(this);
        Calendar now = Calendar.getInstance();
        DatePickerDialog dpd = DatePickerDialog.newInstance(
                TrainStatusDialogActivty.this,
                now.get(Calendar.YEAR),
                now.get(Calendar.MONTH),
                now.get(Calendar.DAY_OF_MONTH)
        );
        dpd.show(getFragmentManager(), "Datepickerdialog");
        dpd.setAccentColor(getResources().getColor(R.color.mdtp_accent_color));
    }
}
