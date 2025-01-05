package com.low.coupling;

public class WebServiceProvider implements UserDataProvider{
    @Override
    public String getUserDetails() {
        return "Webservice Data";
    }
}
