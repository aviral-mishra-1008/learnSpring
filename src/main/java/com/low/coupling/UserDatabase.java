package com.low.coupling;

public class UserDatabase implements UserDataProvider{

    private String data;

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String getUserDetails() {
        return "Database information fetched"+data;
    }
}
