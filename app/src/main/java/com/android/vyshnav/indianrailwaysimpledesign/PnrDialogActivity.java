package com.android.vyshnav.indianrailwaysimpledesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PnrDialogActivity extends AppCompatActivity {

    @BindView(R.id.et_pnr)
    EditText et_pnr;
    @BindView(R.id.b_pnrSearch)
    Button b_pnrSearch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pnr_dialog);



    }

    public void clickedPnr(View view){
        ButterKnife.bind(this);
        Intent myIntent = new Intent(PnrDialogActivity.this, PnrActivity.class);
        myIntent.putExtra("keyPnr", et_pnr.getText().toString());
        PnrDialogActivity.this.startActivity(myIntent);
    }
}
