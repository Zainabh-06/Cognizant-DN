package com.cts.mockito;

public class OrderManager {

    private OrderService service;

    public OrderManager(OrderService service) {
        this.service = service;
    }

    public void processOrder() {

        service.stepOne();

        service.stepTwo();

    }

}