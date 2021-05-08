package com.hepsisurada;

import com.hepsisurada.adapters.SignUpWithGoogle;
import com.hepsisurada.business.abstracts.CustomerService;
import com.hepsisurada.business.concretes.CustomerManager;
import com.hepsisurada.core.abstracts.GoogleSignUpService;
import com.hepsisurada.core.concretes.EmailManager;
import com.hepsisurada.core.concretes.ValidationManager;
import com.hepsisurada.dataAccess.concretes.PostgreSqlDao;
import com.hepsisurada.entities.concretes.Customer;

public class Main {

    public static void main(String[] args) {

        System.out.println("-------------------");

        Customer customer = new Customer();
        customer.setConfirmed(false);
        customer.setEmail("ismailoguzcanarslan@gmail.com");
        customer.setFirstName("İsmail Oğuzcan");
        customer.setPassword("1234567");
        customer.setLastName("Arslan");

        CustomerService customerService = new CustomerManager(new PostgreSqlDao(), new ValidationManager(), new EmailManager());
        System.out.println(customerService.signUp(customer));
        System.out.println(customerService.confirmCustomer(customer));
        //GoogleSignUpService googleSignUpService = new SignUpWithGoogle();
        //System.out.println(googleSignUpService.signUp(customer));


    }
}
