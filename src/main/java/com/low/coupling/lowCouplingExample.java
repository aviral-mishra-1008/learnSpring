package com.low.coupling;

public class lowCouplingExample {
    public static void main(String[] args) {
        //Database 1
        UserDataProvider userDb = new UserDatabase();
        UserDataManager manager = new UserDataManager(userDb);
        System.out.println(manager.getUserInfo());

        //Now suppose we change the database to a webservice
        //We just need to create another database class and kaboom we have another database stream

        UserDataProvider webDb = new WebServiceProvider();
        UserDataManager manager2 = new UserDataManager(webDb);
        System.out.println(manager2.getUserInfo());

        //Thus in this manner we can have low coupling and it makes the process of adding or changing a databse
        //a lot more easier

        //Might be make a manager instance for each DB rather than one being used again and again here for concurrent access
        //The creation of an instance of the UserDataManager with the argument as webDb because the constructor of
        //the class needs that is called the dependency injection
        //Inversion of control is the primary feature or spring framework where we don't need to create and inject the
        //objects rather the dependency injection itself manages the stuff!!
        //now objects which are managed by framework are called beans
    }
}
