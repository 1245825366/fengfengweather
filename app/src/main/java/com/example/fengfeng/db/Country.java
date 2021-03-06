package com.example.fengfeng.db;

import org.litepal.crud.DataSupport;

public class Country extends DataSupport {
    private int id;
    private String countryName;
    private int weatherId;
    private int cityId;

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }
    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }
}
