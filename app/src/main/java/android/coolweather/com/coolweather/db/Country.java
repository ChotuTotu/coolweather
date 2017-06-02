package android.coolweather.com.coolweather.db;

import DataSupport;

/**
 * Created by Administrator on 2017/6/2.
 */

public class Country extends DataSupport {
    private int id;
    private String contryName;
    private int countryCode;

    public int getId() {
        return id;
    }

    public String getContryName() {
        return contryName;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContryName(String contryName) {
        this.contryName = contryName;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }
}
