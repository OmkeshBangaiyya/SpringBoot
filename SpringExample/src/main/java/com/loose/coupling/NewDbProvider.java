package com.loose.coupling;

public class NewDbProvider implements UserDataProvider{

    public String getUserDetails(){
        return "Data fetch from new data provider";
    }
}
