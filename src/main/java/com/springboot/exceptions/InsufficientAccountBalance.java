package com.springboot.exceptions;

public class InsufficientAccountBalance extends RuntimeException{

    public InsufficientAccountBalance(String message) {
        super(message);
    }

}
