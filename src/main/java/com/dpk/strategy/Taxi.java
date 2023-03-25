package com.dpk.designpatterns.strategy;

public class Taxi implements TransportStrategy {

    @Override
    public void selectTransport() {
        System.out.println("User decided to travel by Taxi");
    }
}
