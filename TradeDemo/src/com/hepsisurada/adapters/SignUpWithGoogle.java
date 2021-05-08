package com.hepsisurada.adapters;

import com.hepsisurada.business.abstracts.CustomerService;
import com.hepsisurada.core.abstracts.GoogleSignUpService;
import com.hepsisurada.entities.concretes.Customer;

public class SignUpWithGoogle implements GoogleSignUpService {

    public String signUp(Customer customer)
    {
        return "Signed up with google.";
    }
}
