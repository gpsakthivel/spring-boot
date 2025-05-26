package com.codewithmosh.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service
public class OrderService {

    // Tightly coupled method
    // public void placeOrder() {
    //    var paymentService = new StripePaymentService();
    //    paymentService.processPayment(10);
    // }

    // Loosely coupled method
    // private PaymentService paymentService;

    // public OrderService(PaymentService paymentService) {
    //    this.paymentService = paymentService;
    // }

    // public void placeOrder() {
    //    paymentService.processPayment(10);
    // }

    private PaymentService paymentService;

//    public OrderService(PaymentService paymentService, int x) {}
//
//    @Autowired
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
       paymentService.processPayment(10);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
