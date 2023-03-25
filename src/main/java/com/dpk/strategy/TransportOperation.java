package com.dpk.designpatterns.strategy;

public class TransportOperation {

    public void chooseTransport(String mode) {
        if("car".equalsIgnoreCase(mode)) {
            System.out.println("User decided to travel by " + mode);
        } else if ("bus".equalsIgnoreCase(mode)) {
            System.out.println("User decided to travel by " + mode);
        } else if ("taxi".equalsIgnoreCase(mode)) {
            System.out.println("User decided to travel by " + mode);
        } else {
            throw new IllegalArgumentException(mode + " mode is not supported");
        }
    }
}
