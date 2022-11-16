package com.example.test;

public class tripdata {
    String trip_name;
    String price;
    Integer imageurl;

    public tripdata(String trip_name, String price, Integer imageurl) {
        this.trip_name = trip_name;
        this.price = price;
        this.imageurl = imageurl;
    }

    public String getTrip_name() {
        return trip_name;
    }

    public void setTrip_name(String trip_name) {
        this.trip_name = trip_name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getImageurl() {
        return imageurl;
    }

    public void setImageurl(Integer imageurl) {
        this.imageurl = imageurl;
    }
}
