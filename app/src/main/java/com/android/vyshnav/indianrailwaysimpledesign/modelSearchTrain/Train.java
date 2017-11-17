package com.android.vyshnav.indianrailwaysimpledesign.modelSearchTrain;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

@Generated("org.jsonschema2pojo")
public class Train extends RealmObject {

    private RealmList<Days> days = new RealmList<Days>();
    private int no;
    private String number;
    private String dest_arrival_time;
    private To to;
    private From from;
    private RealmList<Classes> classes = new RealmList<Classes>();
    private String name;
    private String src_departure_time;
    private String travel_time;


    /**
     *
     * @return
     * The days
     */
    public RealmList<Days> getDays() {
        return days;
    }

    /**
     *
     * @param days
     * The days
     */
    public void setDays(RealmList<Days> days) {
        this.days = days;
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
     * The number
     */
    public String getNumber() {
        return number;
    }

    /**
     *
     * @param number
     * The number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     *
     * @return
     * The destArrivalTime
     */
    public String getDestArrivalTime() {
        return dest_arrival_time;
    }

    /**
     *
     * @param destArrivalTime
     * The dest_arrival_time
     */
    public void setDestArrivalTime(String destArrivalTime) {
        this.dest_arrival_time = destArrivalTime;
    }

    /**
     *
     * @return
     * The to
     */
    public To getTo() {
        return to;
    }

    /**
     *
     * @param to
     * The to
     */
    public void setTo(To to) {
        this.to = to;
    }

    /**
     *
     * @return
     * The from
     */
    public From getFrom() {
        return from;
    }

    /**
     *
     * @param from
     * The from
     */
    public void setFrom(From from) {
        this.from = from;
    }

    /**
     *
     * @return
     * The classes
     */
    public RealmList<Classes> getClasses() {
        return classes;
    }

    /**
     *
     * @param classes
     * The classes
     */
    public void setClasses(RealmList<Classes> classes) {
        this.classes = classes;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The srcDepartureTime
     */
    public String getSrcDepartureTime() {
        return src_departure_time;
    }

    /**
     *
     * @param srcDepartureTime
     * The src_departure_time
     */
    public void setSrcDepartureTime(String srcDepartureTime) {
        this.src_departure_time = srcDepartureTime;
    }

    /**
     *
     * @return
     * The travelTime
     */
    public String getTravelTime() {
        return travel_time;
    }

    /**
     *
     * @param travelTime
     * The travel_time
     */
    public void setTravelTime(String travelTime) {
        this.travel_time = travelTime;
    }



}