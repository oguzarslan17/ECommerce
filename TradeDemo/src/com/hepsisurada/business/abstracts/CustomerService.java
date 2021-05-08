package com.hepsisurada.business.abstracts;

import com.hepsisurada.dataAccess.abstracts.CustomerDao;
import com.hepsisurada.entities.concretes.Customer;

public interface CustomerService {

    String signUp(Customer customer);

    String login(String email, String password);

    String confirmCustomer(Customer customer);
}
