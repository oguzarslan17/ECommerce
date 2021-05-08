package com.hepsisurada.dataAccess.concretes;

import com.hepsisurada.dataAccess.abstracts.CustomerDao;
import com.hepsisurada.entities.concretes.Customer;

public class PostgreSqlDao implements CustomerDao {

    @Override
    public Boolean signUp(Customer customer) {
        return true;
    }

    @Override
    public Boolean login(String email, String password) {
        return true;
    }

    @Override
    public Boolean isCustomerExists(String email) {
        return true;
    }

    @Override
    public Boolean update(Customer customer) {
        return true;
    }
}
