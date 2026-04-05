package com.iris.toiletfinderwellington.model;


public class Toilet {
    private int id;
    private double latitude;
    private double longitude;
    private String name;
    private String address;
    private String openHours;
    private String type;
    private String gender;
    private String suburb;
    private boolean mobilityAccess;
    private boolean babyChangeTable;
    private float rating;

    public Toilet(int id, double latitude, double longitude, String name, String address,String openHours, String type, String gender, String suburb, boolean mobilityAccess, boolean babyChangeTable, float rating) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.address = address;
        this.openHours = openHours;
        this.type = type;
        this.gender = gender;
        this.suburb = suburb;
        this.mobilityAccess = mobilityAccess;
        this.babyChangeTable = babyChangeTable;
        this.rating = rating;

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


    public String getOpenHours() {
        return openHours;
    }

    public String getType() {
        return type;
    }

    public String getGender() {
        return gender;
    }

    public String getSuburb() {
        return suburb;
    }

    public boolean isMobilityAccess() {
        return mobilityAccess;
    }

    public boolean isBabyChangeTable() {
        return babyChangeTable;
    }
}
