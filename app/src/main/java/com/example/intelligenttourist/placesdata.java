package com.example.test;

public class placesdata {
    String place_name;
    String price;
    Integer imageurl;

    public placesdata(String place_name,String price, Integer imageurl) {
        this.place_name = place_name;
        this.price=price;
        this.imageurl=imageurl;
    }

    public Integer getImageurl() {
        return imageurl;
    }

    public void setImageurl(Integer imageurl) {
        this.imageurl = imageurl;
    }

    public String getPlace_name() {
        return place_name;
    }

    public void setPlace_name(String place_name) {
        this.place_name = place_name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
