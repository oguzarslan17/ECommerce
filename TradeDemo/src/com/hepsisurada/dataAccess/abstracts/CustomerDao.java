package com.hepsisurada.dataAccess.abstracts;

import com.hepsisurada.entities.concretes.Customer;

public interface CustomerDao {

    Boolean signUp(Customer customer);

    Boolean login(String email, String password);

    Boolean isCustomerExists(String email);

    Boolean update(Customer customer);
}

