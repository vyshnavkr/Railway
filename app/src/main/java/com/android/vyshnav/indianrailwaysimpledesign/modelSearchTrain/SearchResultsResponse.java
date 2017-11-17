package com.android.vyshnav.indianrailwaysimpledesign.modelSearchTrain;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

@Generated("org.jsonschema2pojo")
public class SearchResultsResponse extends RealmObject{

    @PrimaryKey
    private String key;
    private int total;
    private String error;
    private RealmList<Train> train = new RealmList<Train>();
    private int response_code;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    /**
     *
     * @return
     * The train
     */
    public RealmList<Train> getTrain() {
        return train;
    }

    /**
     *
     * @param train
     * The train
     */
    public void setTrain(RealmList<Train> train) {
        this.train = train;
    }

    /**
     *
     * @return
     * The responseCode
     */
    public int getResponseCode() {
        return response_code;
    }

    /**
     *
     * @param responseCode
     * The response_code
     */
    public void setResponseCode(int responseCode) {
        this.response_code = responseCode;
    }

    /**
     *
     * @return
     * The total
     */
    public int getTotal() {
        return total;
    }

    /**
     *
     * @param total
     * The total
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     *
     * @return
     * The error
     */
    public String getError() {
        return error;
    }

    /**
     *
     * @param error
     * The error
     */
    public void setError(String error) {
        this.error = error;
    }



}

