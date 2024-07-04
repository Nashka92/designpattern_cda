package org.example.tp3_adapter;

public class PaymentAdapter implements OldPaymentGateway {
    private NewPaymentProcessor newPaymentProcessor;
    private String apiKey;

    public PaymentAdapter(String apiKey) {
        this.newPaymentProcessor = new NewPaymentProcessor();
        this.apiKey = apiKey;
    }

    @Override
    public void makePayment(String accountNumber, double amount) {
        newPaymentProcessor.authenticate(apiKey);
        newPaymentProcessor.sendPayment(amount);
    }
}
