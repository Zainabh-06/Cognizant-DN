package com.cts.mockito;

public class PaymentManager {

    private PaymentService paymentService;

    public PaymentManager(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void makePayment() throws Exception {
        paymentService.processPayment();
    }
}