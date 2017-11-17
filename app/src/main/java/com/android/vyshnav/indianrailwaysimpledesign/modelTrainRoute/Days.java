package com.android.vyshnav.indianrailwaysimpledesign.modelTrainRoute;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Days {

    private String runs;
    @SerializedName("day-code")
    private String dayCode;

    /**
     *
     * @return
     * The runs
     */
    public String getRuns() {
        return runs;
    }

    /**
     *
     * @param runs
     * The runs
     */
    public void setRuns(String runs) {
        this.runs = runs;
    }

    /**
     *
     * @return
     * The dayCode
     */
    public String getDayCode() {
        return dayCode;
    }

    /**
     *
     * @param dayCode
     * The day-code
     */
    public void setDayCode(String dayCode) {
        this.dayCode = dayCode;
    }

}
