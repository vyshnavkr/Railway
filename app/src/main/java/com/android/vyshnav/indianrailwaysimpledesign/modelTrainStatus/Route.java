package com.android.vyshnav.indianrailwaysimpledesign.modelTrainStatus;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Route {

    private String actdep;
    @SerializedName("actarr_date")
    private String actarrDate;
    private String scharr;
    private int day;
    @SerializedName("scharr_date")
    private String scharrDate;
    private String actarr;
    private int distance;
    private int latemin;
    private int no;
    @SerializedName("has_arrived")
    private boolean hasArrived;
    private String status;
    @SerializedName("has_departed")
    private boolean hasDeparted;
    private String schdep;
    private String station;
    @SerializedName("station_")
    private Station_ station_;

    /**
     *
     * @return
     * The actdep
     */
    public String getActdep() {
        return actdep;
    }

    /**
     *
     * @param actdep
     * The actdep
     */
    public void setActdep(String actdep) {
        this.actdep = actdep;
    }

    /**
     *
     * @return
     * The actarrDate
     */
    public String getActarrDate() {
        return actarrDate;
    }

    /**
     *
     * @param actarrDate
     * The actarr_date
     */
    public void setActarrDate(String actarrDate) {
        this.actarrDate = actarrDate;
    }

    /**
     *
     * @return
     * The scharr
     */
    public String getScharr() {
        return scharr;
    }

    /**
     *
     * @param scharr
     * The scharr
     */
    public void setScharr(String scharr) {
        this.scharr = scharr;
    }

    /**
     *
     * @return
     * The day
     */
    public int getDay() {
        return day;
    }

    /**
     *
     * @param day
     * The day
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     *
     * @return
     * The scharrDate
     */
    public String getScharrDate() {
        return scharrDate;
    }

    /**
     *
     * @param scharrDate
     * The scharr_date
     */
    public void setScharrDate(String scharrDate) {
        this.scharrDate = scharrDate;
    }

    /**
     *
     * @return
     * The actarr
     */
    public String getActarr() {
        return actarr;
    }

    /**
     *
     * @param actarr
     * The actarr
     */
    public void setActarr(String actarr) {
        this.actarr = actarr;
    }

    /**
     *
     * @return
     * The distance
     */
    public int getDistance() {
        return distance;
    }

    /**
     *
     * @param distance
     * The distance
     */
    public void setDistance(int distance) {
        this.distance = distance;
    }

    /**
     *
     * @return
     * The latemin
     */
    public int getLatemin() {
        return latemin;
    }

    /**
     *
     * @param latemin
     * The latemin
     */
    public void setLatemin(int latemin) {
        this.latemin = latemin;
    }

    /**
     *
     * @return
     * The no
     */
    public int getNo() {
        return no;
    }

    /**
     *
     * @param no
     * The no
     */
    public void setNo(int no) {
        this.no = no;
    }

    /**
     *
     * @return
     * The hasArrived
     */
    public boolean isHasArrived() {
        return hasArrived;
    }

    /**
     *
     * @param hasArrived
     * The has_arrived
     */
    public void setHasArrived(boolean hasArrived) {
        this.hasArrived = hasArrived;
    }

    /**
     *
     * @return
     * The status
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *
     * @return
     * The hasDeparted
     */
    public boolean isHasDeparted() {
        return hasDeparted;
    }

    /**
     *
     * @param hasDeparted
     * The has_departed
     */
    public void setHasDeparted(boolean hasDeparted) {
        this.hasDeparted = hasDeparted;
    }

    /**
     *
     * @return
     * The schdep
     */
    public String getSchdep() {
        return schdep;
    }

    /**
     *
     * @param schdep
     * The schdep
     */
    public void setSchdep(String schdep) {
        this.schdep = schdep;
    }

    /**
     *
     * @return
     * The station
     */
    public String getStation() {
        return station;
    }

    /**
     *
     * @param station
     * The station
     */
    public void setStation(String station) {
        this.station = station;
    }

    /**
     *
     * @return
     * The stationU
     */
    public Station_ getStation_() {
        return station_;
    }

    /**
     *
     * @param stationU
     * The stationU
     */
    public void setStation_(Station_ station_) {
        this.station_ = station_;
    }

}
