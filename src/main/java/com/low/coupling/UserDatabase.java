package com.low.coupling;

public class UserDatabase implements UserDataProvider{
    @Override
    public String getUserDetails() {
        return "Database information fetched";
    }
}
