package com.hepsisurada.core.abstracts;

import com.hepsisurada.entities.concretes.Customer;

public interface ValidationService {

    public Boolean isValid(Customer customer);
}
