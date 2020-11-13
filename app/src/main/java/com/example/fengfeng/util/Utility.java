package com.example.fengfeng.util;

import android.text.TextUtils;
import com.example.fengfeng.db.City;
import com.example.fengfeng.db.Country;
import com.example.fengfeng.db.Province;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Utility {
    public static boolean handleProvinceResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allProvinces = new JSONArray(response);
                for (int i = 0; i < allProvinces.length(); i++) {
                    JSONObject province0bject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName (province0bject.getString("name"));
                    province.setProvienceCode(province0bject.getInt("id"));
                    province.save();
                }
                    return true;
                } catch(JSONException e){
                    e.printStackTrace();
                }
            }
            return false;
        }

    public static boolean handleCityResponse(String response,int provienceId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allProvinces = new JSONArray(response);
                for (int i = 0; i < allProvinces.length(); i++) {
                    JSONObject city0bject = allProvinces.getJSONObject(i);
                    City city = new City();
                    city.setCityName (city0bject.getString("name"));
                    city.setCityCode(city0bject.getInt("id"));
                    city.setProvienceId(provienceId);
                    city.save();
                }
                return true;
            } catch(JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean handleCountryResponse(String response , int cityId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCounties = new JSONArray(response);
                for (int i = 0; i < allCounties.length(); i++) {
                    JSONObject country0bject = allCounties.getJSONObject(i);
                   Country country = new Country();
                    country.setCountryName (country0bject.getString("name"));
                    country.setWeatherId(country0bject.getInt("weather_id"));
                    country.setCityId(cityId);
                    country.save();
                }
                return true;
            } catch(JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }

    }
