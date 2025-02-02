package com.low.coupling;

public class WebServiceProvider implements UserDataProvider{

    private String data;

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String getUserDetails() {
        return "Webservice Data"+" "+data;
    }
}
