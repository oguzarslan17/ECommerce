package com.hepsisurada.core.abstracts;

public interface EmailService {
    void sendEmail(String toEmail, String customerName, String description);
}
