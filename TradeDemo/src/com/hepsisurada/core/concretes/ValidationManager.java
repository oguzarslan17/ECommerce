package com.hepsisurada.core.concretes;

import com.hepsisurada.core.abstracts.ValidationService;
import com.hepsisurada.entities.concretes.Customer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationManager implements ValidationService {
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}", Pattern.CASE_INSENSITIVE);

    //BASKA PROJELERDE KULLANILMASI OLASI OLDUGUNU DUSUNDUGUM ICIN CORE KATMANINDA
    @Override
    public Boolean isValid(Customer customer) {

        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(customer.getEmail());

        if(!matcher.matches())
            return false;
        else if(customer.getPassword().length() < 6)
            return false;
        else if(customer.getFirstName().length() < 2 || customer.getLastName().length() < 2)
            return false;

        return true;
    }
}
