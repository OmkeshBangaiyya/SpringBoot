package com.loose.coupling;

import com.tight.coupling.UserDatabase;

//managing all the user information
public class UserManager {

    private UserDataProvider userDataProvider;

    public UserManager(UserDataProvider userDataProvider){
        this.userDataProvider=userDataProvider;
    }
    public String getUserInfo(){
        return userDataProvider.getUserDetails();
    }
}
