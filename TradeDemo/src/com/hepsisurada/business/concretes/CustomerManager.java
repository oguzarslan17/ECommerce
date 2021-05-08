package com.hepsisurada.business.concretes;

import com.hepsisurada.business.abstracts.CustomerService;
import com.hepsisurada.core.abstracts.EmailService;
import com.hepsisurada.core.abstracts.GoogleSignUpService;
import com.hepsisurada.core.abstracts.ValidationService;
import com.hepsisurada.dataAccess.abstracts.CustomerDao;
import com.hepsisurada.entities.concretes.Customer;

public class CustomerManager implements CustomerService {

    private CustomerDao customerDao;
    private ValidationService validationService;
    private EmailService emailService;

    public CustomerManager(CustomerDao customerDao, ValidationService validationService, EmailService emailService){
        this.customerDao = customerDao;
        this.validationService = validationService;
        this.emailService = emailService;
    }

    @Override
    public String signUp(Customer customer) {

        if(validationService.isValid(customer))
        {
            if(customerDao.isCustomerExists(customer.getEmail()))
            {
                customerDao.signUp(customer);
                emailService.sendEmail(customer.getEmail(),customer.getFirstName(),"Welcome !");
                return "Click on the link we sent you to complete your membership.";
            }
        }
        return "Please check your informations";
    }

    @Override
    public String login(String email, String password) {
        if(customerDao.login(email,password))
            return "Welcome";
        return "Check your email or password";
    }

    @Override
    public String confirmCustomer(Customer customer) {
        customer.setConfirmed(true);
        if(customerDao.update(customer))
            return "Your account has been verified";
        else
            return "Something went wrong";
    }
}
