package com.learning.testing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${paymentService}")
    private String paymentSelection;

    @Bean
    public PaymentService stripe() {
        return new StripePaymentService();
    }

    @Bean
    public PaymentService paypal() {
        return new PayPalPaymentService();
    }

    @Bean
    public OrderService orderService() throws Exception {
        
        switch (paymentSelection) {
            case "stripe":
                return new OrderService(this.stripe());

            case "paypal":
                return new OrderService(this.paypal());

            default:
                throw new Exception("No payment service was specified");
        }
    }
}
