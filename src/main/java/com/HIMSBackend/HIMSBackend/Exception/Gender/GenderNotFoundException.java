package com.HIMSBackend.HIMSBackend.Exception.Gender;

public class GenderNotFoundException extends RuntimeException {

    public GenderNotFoundException() {
        super("No genders found.");
    }

    public GenderNotFoundException(String message) {
        super(message);
    }
}