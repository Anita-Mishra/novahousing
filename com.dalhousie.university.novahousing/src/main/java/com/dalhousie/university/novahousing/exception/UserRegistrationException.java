package com.dalhousie.university.novahousing.exception;

// Author- Anita Kumari (B00884141)
public class UserRegistrationException extends Exception{

    private String message;

    public UserRegistrationException(String message) {
        super(message);
        this.message=message;
    }

}
