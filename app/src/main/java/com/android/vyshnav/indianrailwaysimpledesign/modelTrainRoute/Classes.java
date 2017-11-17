package com.android.vyshnav.indianrailwaysimpledesign.modelTrainRoute;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Classes {

    @SerializedName("class-code")
    private String classesCode;
    private String available;

    /**
     *
     * @return
     * The classCode
     */
    public String getClassesCode() {
        return classesCode;
    }

    /**
     *
     * @param classCode
     * The class-code
     */
    public void setClassesCode(String classesCode) {
        this.classesCode = classesCode;
    }

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

}
