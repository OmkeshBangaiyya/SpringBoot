package com.tight.coupling;

//managing all the user information
public class UserManager {

    private UserDatabase userDatabase=new UserDatabase();
    public String getUserInfo(){
        return userDatabase.getUserDetails();
    }
}
