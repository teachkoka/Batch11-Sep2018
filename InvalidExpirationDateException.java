package com.bell.b11.day8.exceptions;

public class InvalidExpirationDateException extends java.lang.RuntimeException {

    public InvalidExpirationDateException() {
    }

    @Override
    public String toString() {
        return "Expiration Date is invalid.Please provide proper value";
    }
}
