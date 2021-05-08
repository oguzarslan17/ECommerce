package com.hepsisurada.core.concretes;

import com.hepsisurada.core.abstracts.EmailService;

public class EmailManager implements EmailService {

    @Override
    public void sendEmail(String toEmail, String customerName, String description) {
        System.out.println("Sample email template. Includes to address to name and VERICIFITION LINK");
    }
}
