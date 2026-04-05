package com.iris.toiletfinderwellington.model;
import java.util.List;

public class Toilet {
    private int id;
    private double latitude;
    private double longitude;
    private String name;
    private String address;
    private float rating;
    private String scale;
    private String openTime;
    private String closeTime;
    private List<String> facilities;
    private boolean isIndependent;

    public Toilet(int id, double latitude, double longitude, String name, String address, float rating, String scale, String openTime, String closeTime, List<String> facilities, boolean isIndependent) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.address = address;
        this.rating = rating;
        this.scale = scale;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.facilities = facilities;
        this.isIndependent = isIndependent;
    }

    public double getLatitude() {
        return latitude;
    }

    public int getId() {
        return id;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public float getRating() {
        return rating;
    }
    public void setRating(float rating) {
        this.rating = rating;
    }


    public String getScale() {
        return scale;
    }

    public String getOpenTime() {
        return openTime;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public List<String> getFacilities() {
        return facilities;
    }

    public boolean isIndependent() {
        return isIndependent;
    }
}
