package com.smartystreets.api.us_zipcode;

import com.google.api.client.util.Key;

public class Result {
    //region [ Fields ]

    @Key("status")
    String status;

    @Key("reason")
    String reason;

    @Key("input_index")
    private int inputIndex;

    @Key("city_states")
    private City[] cities;

    @Key("zipcodes")
    private ZipCode[] zipCodes;

    //endregion

    public Result() {
    }

    public boolean isValid() {
        return (this.status == null && this.reason == null);
    }

    public City getCity(int index) {
        return this.cities[index];
    }

    public ZipCode getZipCode(int index) {
        return this.zipCodes[index];
    }

    //region [ Getters ]

    public String getStatus() {
        return this.status;
    }

    public String getReason() {
        return this.reason;
    }

    public int getInputIndex() {
        return this.inputIndex;
    }

    public City[] getCities() {
        return this.cities;
    }

    public ZipCode[] getZipCodes() {
        return this.zipCodes;
    }

    //endregion
}
