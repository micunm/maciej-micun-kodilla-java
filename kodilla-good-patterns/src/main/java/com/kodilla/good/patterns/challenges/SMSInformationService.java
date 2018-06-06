package com.kodilla.good.patterns.challenges;

public class SMSInformationService implements OrderInformationService {
    @Override
    public void send(String message) {
        System.out.println(message);
    }
}
