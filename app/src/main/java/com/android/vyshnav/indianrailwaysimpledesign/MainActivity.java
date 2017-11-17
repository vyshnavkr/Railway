package com.android.vyshnav.indianrailwaysimpledesign;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.android.vyshnav.indianrailwaysimpledesign.adapterSearchTrain.SearchResultsDataAdapter;
import com.android.vyshnav.indianrailwaysimpledesign.animation.DividerItemDecoration;
import com.android.vyshnav.indianrailwaysimpledesign.modelSearchTrain.SearchResultsResponse;
import com.android.vyshnav.indianrailwaysimpledesign.modelSearchTrain.Train;
import com.android.vyshnav.indianrailwaysimpledesign.rest.SearchResultsApiClient;
import com.android.vyshnav.indianrailwaysimpledesign.rest.SearchResultsApiInterface;

import java.util.List;

import io.realm.Realm;
import io.realm.RealmAsyncTask;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    private RecyclerView recyclerView;
    private final static String API_KEY = "iqqcq8635";
    String SSC ;
    String DSC;
    String DATE;
    Toolbar toolbar;
    Realm realm;
    private RealmConfiguration myconfig;
    RealmAsyncTask transaction;
    RealmResults<Train> traindata;
    RealmResults<Train> traindataLaunch;
    Intent intent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        intent = getIntent();
        SSC = intent.getStringExtra("keyFrom"); //if it's a string you stored.
        DSC = intent.getStringExtra("keyTo"); //if it's a string you stored.
        DATE = intent.getStringExtra("keyDate"); //if it's a string you stored.

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        myconfig = new RealmConfiguration.Builder(this).name("anotherrealm.realm").deleteRealmIfMigrationNeeded().build();
        realm = Realm.getInstance(myconfig);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        initViews();

    }

    private void initViews(){
        recyclerView = (RecyclerView)findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(
                new DividerItemDecoration(getApplicationContext()));


        traindataLaunch = realm.where(Train.class).findAllAsync();
        traindata = realm.where(Train.class).equalTo("from.code",SSC).equalTo("to.code",DSC).findAllAsync();


        if (intent==null) {
            if (traindataLaunch != null) {
                SearchResultsDataAdapter adapter = new SearchResultsDataAdapter(MainActivity.this, traindataLaunch);
                recyclerView.setAdapter(adapter);
                String toolbarTitle = SSC + " " + "-" + " " + DSC;
                toolbar.setTitle(toolbarTitle);
            }
        }

        if(intent!=null) {
            if (isNetworkConnected()) {
                loadJSON();
            } else {
                Toast.makeText(getApplicationContext(), "You are offline", Toast.LENGTH_LONG).show();
                if (traindata != null) {
                    loadRealm();
                }
            }
        }

    }

    private void loadJSON(){

        SearchResultsApiInterface apiService = SearchResultsApiClient.getClient().create(SearchResultsApiInterface.class);
        Call<SearchResultsResponse> call = apiService.getTrainNameResponse(SSC,DSC,DATE,API_KEY);
        call.enqueue(new Callback<SearchResultsResponse>() {
            @Override
            public void onResponse(Call<SearchResultsResponse> call, Response<SearchResultsResponse> response) {

                final SearchResultsResponse jsonResponse = response.body();
                jsonResponse.setKey(SSC+DSC+DATE);
                final List<Train> data =  jsonResponse.getTrain();
                String from = data.get(0).getFrom().getCode();
                String to = data.get(0).getTo().getCode();


               /* int tv3 = response.code();
                TextView textView3 = (TextView) findViewById(R.id.tv3);
                textView3.setText(String.valueOf(tv3));*/




                transaction = realm.executeTransactionAsync(new Realm.Transaction() {
                    @Override
                    public void execute(Realm realm) {
                        realm.insertOrUpdate(jsonResponse);
                    }
                }, new Realm.Transaction.OnSuccess() {
                    @Override
                    public void onSuccess() {
                        Toast.makeText(getApplicationContext(),"Data saved", Toast.LENGTH_LONG).show();}
                }, new Realm.Transaction.OnError() {
                    @Override
                    public void onError(Throwable error) {
                        Toast.makeText(getApplicationContext(),"Error in saving",Toast.LENGTH_LONG).show();}
                });
                SearchResultsDataAdapter adapter  = new SearchResultsDataAdapter(MainActivity.this,traindata);
                recyclerView.setAdapter(adapter);


                String toolbarTitle = from + " " + "-" + " " + to;
                toolbar.setTitle(toolbarTitle);
            }

            @Override
            public void onFailure(Call<SearchResultsResponse> call, Throwable t) {
                Log.d("Error", "" + t.getMessage());
            }
        });
    }

    private void loadRealm(){
        SearchResultsDataAdapter adapter  = new SearchResultsDataAdapter(MainActivity.this,traindata);
        recyclerView.setAdapter(adapter);
        String toolbarTitle = SSC + " " + "-" + " " + DSC;
        toolbar.setTitle(toolbarTitle);
    }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_edit) {
            Intent Intent = new Intent(MainActivity.this, SearchDialogActivity.class);
            MainActivity.this.startActivity(Intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
            Intent IntentNav = new Intent(MainActivity.this, SearchDialogActivity.class);
            MainActivity.this.startActivity(IntentNav);

        } else if (id == R.id.nav_gallery) {
            Intent IntentPnrDialog = new Intent(MainActivity.this, PnrDialogActivity.class);
            MainActivity.this.startActivity(IntentPnrDialog);

        } else if (id == R.id.nav_slideshow) {
            Intent IntentTrainStatusDialog = new Intent(MainActivity.this, TrainStatusDialogActivty.class);
            MainActivity.this.startActivity(IntentTrainStatusDialog);

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        realm.close(); // Remember to close Realm when done.

    }


}
