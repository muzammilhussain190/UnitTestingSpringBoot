package com.example.springboottestingpractice.exception;

public class CustomerEmailUnavailableException extends RuntimeException {

    public CustomerEmailUnavailableException(String message) {
        super(message);
    }
}