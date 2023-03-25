package com.dpk.strategy;

public class TransportClient {

    public static void main(String[] args) {
        new TransportClient().selectTransport(new Car());
    }

    public void selectTransport(TransportStrategy strategy) {
        TransportContext context = new TransportContext(strategy);
        context.chooseTransport();
    }
}
