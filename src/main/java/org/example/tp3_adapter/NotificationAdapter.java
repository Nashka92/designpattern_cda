package org.example.tp3_adapter;

import java.util.HashMap;
import java.util.Map;

public class NotificationAdapter implements SmsService {
    private EmailService emailService;
    private Map<String, String> phoneToEmailMap;

    public NotificationAdapter() {
        this.emailService = new EmailService();
        this.phoneToEmailMap = new HashMap<>();
        // Simuler le stockage des correspondances téléphone-email
        phoneToEmailMap.put("1234567890", "user@example.com");
    }

    @Override
    public void sendSms(String number, String message) {
        String email = phoneToEmailMap.get(number);
        if (email != null) {
            emailService.sendEmail(email, "Notification", message);
        } else {
            System.out.println("Aucun email trouvé pour le numéro : " + number);
        }
    }
}

