package com.hepsisurada.core.abstracts;

import com.hepsisurada.business.abstracts.CustomerService;
import com.hepsisurada.entities.concretes.Customer;

public interface GoogleSignUpService {
    public String signUp(Customer customer);
}
