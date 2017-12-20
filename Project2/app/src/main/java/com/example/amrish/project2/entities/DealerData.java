package com.example.amrish.project2.entities;

/**
 * Created by Amrish on 01-Oct-17.
 */

/**
 * Entity for the maintaining the dealers data
 */
public class DealerData {

    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public DealerData(String name, String address) {

        this.name = name;
        this.address = address;
    }
}
