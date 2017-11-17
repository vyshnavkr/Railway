package com.android.vyshnav.indianrailwaysimpledesign.modelSearchTrain;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

import io.realm.RealmObject;

@Generated("org.jsonschema2pojo")
public class Classes extends RealmObject{

    private String available;
    @SerializedName("class-code")
    private String classCode;


    /**
     *
     * @return
     * The available
     */
    public String getAvailable() {
        return available;
    }

    /**
     *
     * @param available
     * The available
     */
    public void setAvailable(String available) {
        this.available = available;
    }

    /**
     *
     * @return
     * The classCode
     */
    public String getClassCode() {
        return classCode;
    }

    /**
     *
     * @param classCode
     * The class-code
     */
    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }



}