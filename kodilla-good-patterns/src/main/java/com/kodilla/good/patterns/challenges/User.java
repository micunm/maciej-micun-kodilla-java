package com.kodilla.good.patterns.challenges;

public class User {
    private String userName;
    private String userSurname;
    private String userEmail;
    private String userAddress;

    public User(String userName, String userSurname, String userEmail, String userAddress) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.userEmail = userEmail;
        this.userAddress = userAddress;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserAddress() {
        return userAddress;
    }
}
