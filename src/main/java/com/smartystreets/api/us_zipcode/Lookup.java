package com.smartystreets.api.us_zipcode;

import com.google.api.client.util.Key;

public class Lookup {
    //region [ Fields ]

    private Result result;

    private String inputId;

    @Key("city")
    private String city;

    @Key("state")
    private String state;

    @Key("zipcode")
    private String zipcode;

    //endregion

    public Lookup() {
        this.result = new Result();
    }

    public Lookup(String zipcode) {
        this();
        this.zipcode = zipcode;
    }

    public Lookup(String city, String state) {
        this();
        this.city = city;
        this.state = state;
    }

    public Lookup(String city, String state, String zipcode) {
        this();
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    //region [ Getters ]

    public Result getResult() {
        return this.result;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public String getZipCode() {
        return this.zipcode;
    }

    public String getInputId() {
        return this.inputId;
    }

    //endregion

    //region [ Setters ]

    public void setResult(Result result) {
        this.result = result;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Lookup setInputId(String inputId) {
        this.inputId = inputId;
        return this;
    }

    //endregion
}
