package com.bell.b11.day8.exceptions;

public class InvalidCvvException extends RuntimeException {

    public InvalidCvvException() {
    }

    @Override
    public String toString() {
        return "CVV is invalid.Please provide proper CVV value";
    }
}
