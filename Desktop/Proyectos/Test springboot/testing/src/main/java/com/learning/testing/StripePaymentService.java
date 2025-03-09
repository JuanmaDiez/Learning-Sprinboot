package com.learning.testing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service("stripe")
//@Primary
public class StripePaymentService implements PaymentService {

    @Value("${stripe.api}")
    private String apiUrl;

    @Value("${stripe.enabled}")
    private boolean enabled;

    @Value("${stripe.timeout:3000}")
    private int timeout;

    @Value("${stripe.currencies}")
    private List<String> currencies;

    @Override
    public void processPayment(double amount) {
        System.out.println(apiUrl);
        System.out.println(enabled);
        System.out.println(timeout);
        System.out.println(currencies);
        System.out.println("STRIPE");
        System.out.println("amount = " + amount);
    }
}
