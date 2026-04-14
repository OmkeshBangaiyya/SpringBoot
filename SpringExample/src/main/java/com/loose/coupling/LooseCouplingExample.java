package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
       UserDataProvider databaseProvider=new UserDatabaseProvider();
       UserManager userManagerWithDB=new UserManager(databaseProvider);
        System.out.println(userManagerWithDB.getUserInfo());

        UserDataProvider userWebDbProvider=new WebDbProvider();
        UserManager userWebManager = new UserManager(userWebDbProvider);
        System.out.println(userWebDbProvider.getUserDetails());

        UserDataProvider UserNewDbProvider=new NewDbProvider();
        UserManager userNewDbManager=new UserManager(UserNewDbProvider);
        System.out.println(userNewDbManager.getUserInfo());

    }
}
