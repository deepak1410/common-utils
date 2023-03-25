package com.dpk.designpatterns.strategy;

public class Bus implements TransportStrategy {

    @Override
    public void selectTransport() {
        System.out.println("User decided to travel by Bus");


    }
}
