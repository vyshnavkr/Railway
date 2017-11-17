package com.android.vyshnav.indianrailwaysimpledesign.modelTrainStatus;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class TrainStatusResponse {

    private String position;
    @SerializedName("start_date")
    private String startDate;
    @SerializedName("current_station")
    private CurrentStation currentStation;
    private List<Route> route = new ArrayList<Route>();
    @SerializedName("response_code")
    private int responseCode;
    private String error;
    @SerializedName("train_number")
    private String trainNumber;

    /**
     *
     * @return
     * The position
     */
    public String getPosition() {
        return position;
    }

    /**
     *
     * @param position
     * The position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     *
     * @return
     * The startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     *
     * @param startDate
     * The start_date
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     *
     * @return
     * The currentStation
     */
    public CurrentStation getCurrentStation() {
        return currentStation;
    }

    /**
     *
     * @param currentStation
     * The current_station
     */
    public void setCurrentStation(CurrentStation currentStation) {
        this.currentStation = currentStation;
    }

    /**
     *
     * @return
     * The route
     */
    public List<Route> getRoute() {
        return route;
    }

    /**
     *
     * @param route
     * The route
     */
    public void setRoute(List<Route> route) {
        this.route = route;
    }

    /**
     *
     * @return
     * The responseCode
     */
    public int getResponseCode() {
        return responseCode;
    }

    /**
     *
     * @param responseCode
     * The response_code
     */
    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
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

    /**
     *
     * @return
     * The trainNumber
     */
    public String getTrainNumber() {
        return trainNumber;
    }

    /**
     *
     * @param trainNumber
     * The train_number
     */
    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

}
