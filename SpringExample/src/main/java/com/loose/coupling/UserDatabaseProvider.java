package com.loose.coupling;

public class UserDatabaseProvider implements UserDataProvider {

    public String getUserDetails(){
        //directly access database here
        return "User details from database111111111111111111";
    }
}
