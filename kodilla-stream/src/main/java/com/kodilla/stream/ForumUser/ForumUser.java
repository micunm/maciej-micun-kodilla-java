package com.kodilla.stream.ForumUser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final String userName;
    private final char userSex;
    private final LocalDate birthDay;
    private final int numberOfUserPosts;

    public ForumUser(int userID, String userName, char userSex, int yearOfBirth, int monthOfBirth, int dayOfBirth, int numberOfUserPosts) {
        this.userID = userID;
        this.userName = userName;
        this.userSex = userSex;
        this.birthDay = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfUserPosts = numberOfUserPosts;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int getNumberOfUserPosts() {
        return numberOfUserPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", birthDay=" + birthDay +
                ", numberOfUserPosts=" + numberOfUserPosts +
                '}';
    }
}
