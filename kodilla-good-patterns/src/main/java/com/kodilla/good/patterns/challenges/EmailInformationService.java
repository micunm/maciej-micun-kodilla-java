package com.kodilla.good.patterns.challenges;

public class EmailInformationService implements Food2DoorInformationService {
    @Override
    public void send(String message) {
        System.out.println("Email sent: "+message);
    }
}
