package org.example.tp3_adapter;

public class NewPaymentProcessor {
    public void authenticate(String apiKey) {
        System.out.println("Authentifié avec la clé API : " + apiKey);
    }

    public void sendPayment(double amount) {
        System.out.println("Paiement envoyé : " + amount);
    }
}
