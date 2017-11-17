package com.android.vyshnav.indianrailwaysimpledesign.modelPnrStatus;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class PnrResponse {

    private int response_code;
    private String train_num;
    @SerializedName("class")
    private String _class;
    private FromStation from_station;
    private List<Object> passengers = new ArrayList<Object>();
    private int total_passengers;
    private double failure_rate;
    private String train_name;
    private String doj;
    private boolean error;
    private TrainStartDate train_start_date;
    private String pnr;
    private ReservationUpto reservation_upto;
    private ToStation to_station;
    private String chart_prepared;
    private BoardingPoint boarding_point;

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
    public void setResponseCode(int response_code) {
        this.response_code = response_code;
    }

    /**
     *
     * @return
     * The trainNum
     */
    public String getTrainNum() {
        return train_num;
    }

    /**
     *
     * @param trainNum
     * The train_num
     */
    public void setTrainNum(String train_num) {
        this.train_num = train_num;
    }

    /**
     *
     * @return
     * The _class
     */
    public String getClass_() {
        return _class;
    }

    /**
     *
     * @param _class
     * The class
     */
    public void setClass_(String _class) {
        this._class = _class;
    }

    /**
     *
     * @return
     * The fromStation
     */
    public FromStation getFromStation() {
        return from_station;
    }

    /**
     *
     * @param fromStation
     * The from_station
     */
    public void setFromStation(FromStation from_station) {
        this.from_station = from_station;
    }

    /**
     *
     * @return
     * The passengers
     */
    public List<Object> getPassengers() {
        return passengers;
    }

    /**
     *
     * @param passengers
     * The passengers
     */
    public void setPassengers(List<Object> passengers) {
        this.passengers = passengers;
    }

    /**
     *
     * @return
     * The totalPassengers
     */
    public int getTotalPassengers() {
        return total_passengers;
    }

    /**
     *
     * @param totalPassengers
     * The total_passengers
     */
    public void setTotalPassengers(int total_passengers) {
        this.total_passengers = total_passengers;
    }

    /**
     *
     * @return
     * The failureRate
     */
    public double getFailureRate() {
        return failure_rate;
    }

    /**
     *
     * @param failureRate
     * The failure_rate
     */
    public void setFailureRate(double failure_rate) {
        this.failure_rate = failure_rate;
    }

    /**
     *
     * @return
     * The trainName
     */
    public String getTrainName() {
        return train_name;
    }

    /**
     *
     * @param trainName
     * The train_name
     */
    public void setTrainName(String train_name) {
        this.train_name = train_name;
    }

    /**
     *
     * @return
     * The doj
     */
    public String getDoj() {
        return doj;
    }

    /**
     *
     * @param doj
     * The doj
     */
    public void setDoj(String doj) {
        this.doj = doj;
    }

    /**
     *
     * @return
     * The error
     */
    public boolean isError() {
        return error;
    }

    /**
     *
     * @param error
     * The error
     */
    public void setError(boolean error) {
        this.error = error;
    }

    /**
     *
     * @return
     * The trainStartDate
     */
    public TrainStartDate getTrainStartDate() {
        return train_start_date;
    }

    /**
     *
     * @param trainStartDate
     * The train_start_date
     */
    public void setTrainStartDate(TrainStartDate train_start_date) {
        this.train_start_date = train_start_date;
    }

    /**
     *
     * @return
     * The pnr
     */
    public String getPnr() {
        return pnr;
    }

    /**
     *
     * @param pnr
     * The pnr
     */
    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    /**
     *
     * @return
     * The reservationUpto
     */
    public ReservationUpto getReservationUpto() {
        return reservation_upto;
    }

    /**
     *
     * @param reservationUpto
     * The reservation_upto
     */
    public void setReservationUpto(ReservationUpto reservation_upto) {
        this.reservation_upto = reservation_upto;
    }

    /**
     *
     * @return
     * The toStation
     */
    public ToStation getToStation() {
        return to_station;
    }

    /**
     *
     * @param toStation
     * The to_station
     */
    public void setToStation(ToStation to_station) {
        this.to_station = to_station;
    }

    /**
     *
     * @return
     * The chartPrepared
     */
    public String getChartPrepared() {
        return chart_prepared;
    }

    /**
     *
     * @param chartPrepared
     * The chart_prepared
     */
    public void setChartPrepared(String chart_prepared) {
        this.chart_prepared = chart_prepared;
    }

    /**
     *
     * @return
     * The boardingPoint
     */
    public BoardingPoint getBoardingPoint() {
        return boarding_point;
    }

    /**
     *
     * @param boardingPoint
     * The boarding_point
     */
    public void setBoardingPoint(BoardingPoint boarding_point) {
        this.boarding_point = boarding_point;
    }

}