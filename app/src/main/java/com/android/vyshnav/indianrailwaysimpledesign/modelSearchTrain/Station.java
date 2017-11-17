package com.android.vyshnav.indianrailwaysimpledesign.modelSearchTrain;

import io.realm.RealmObject;

public class Station extends RealmObject {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){//overriding the toString() method
        return name;
    }
}

