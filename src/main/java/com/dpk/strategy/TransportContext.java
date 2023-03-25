package com.dpk.designpatterns.strategy;

public class TransportContext {

    private TransportStrategy transportStrategy;

    public TransportContext(TransportStrategy transportStrategy) {
        this.transportStrategy = transportStrategy;
    }

    public void chooseTransport() {
        transportStrategy.selectTransport();
    }
}
