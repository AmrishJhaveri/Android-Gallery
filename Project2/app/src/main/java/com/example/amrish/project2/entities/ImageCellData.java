package com.example.amrish.project2.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Amrish on 30-Sep-17.
 */

/**
 * Entity for maintaining details for each image
 */
public class ImageCellData {

    private static final int NO_OF_DEALERS = 3;

    /**
     * Drawable id of the image is stored
     */
    private Integer id;

    /**
     * Name of the car is stored
     */
    private String name;

    /**
     * The URL of the official webiste is stored.
     */
    private String url;

    /**
     * List of all the dealers for the a particular car is stored
     */
    private List<DealerData> dealers;

    /**
     * Constructor
     *
     * @param id   drawable id of the image
     * @param url  URL of the website
     * @param name Name of the car
     */
    public ImageCellData(Integer id, String url, String name) {
        this.id = id;
        this.url = url;
        this.name = name;
        this.dealers = new ArrayList<>();
    }

    /**
     * Adding the dealers(3) in the list
     *
     * @param name    Array of name of all the dealers
     * @param address Array of addresses of all the dealers
     * @return
     */
    public ImageCellData addDealers(String[] name, String[] address) {
        //initialize the list if empty
        if (dealers == null) {
            dealers = new ArrayList<>();
        }
        //add the data to the list from the array
        for (int i = 0; i < NO_OF_DEALERS; i++) {
            dealers.add(new DealerData(name[i], address[i]));
        }
        return this;
    }

    public List<DealerData> getDealers() {
        return dealers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
