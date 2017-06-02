package android.coolweather.com.coolweather.db;

import DataSuppport;

/**
 * Created by Administrator on 2017/6/2.
 */

public class City extends DataSuppport {
    private int id;
    private String cityName;
    private int cityCode;

    public void setId(int id) {
        this.id = id;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getId() {
        return id;
    }

    public int getCityCode() {
        return cityCode;
    }

    public String getCityName() {
        return cityName;
    }
}
