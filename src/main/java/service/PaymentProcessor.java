package service;

import interf.PaymentStrategy;

public class PaymentProcessor {

    private PaymentStrategy paymentStrategy;
    public PaymentProcessor(PaymentStrategy strategy){
        this.paymentStrategy = strategy;
    }

    public void processPayment(double amount){
        paymentStrategy.processPayment(amount);
    }
}
