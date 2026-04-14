package com.loose.coupling;

public class WebDbProvider implements UserDataProvider{
    @Override
    public String getUserDetails() {
        return "User data fetch from webServer";
    }
}
