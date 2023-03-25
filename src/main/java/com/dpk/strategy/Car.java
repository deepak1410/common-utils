package com.dpk.strategy;

public class Car implements TransportStrategy {

    @Override
    public void selectTransport() {
        System.out.println("User decided to travel by Car");
    }
}
