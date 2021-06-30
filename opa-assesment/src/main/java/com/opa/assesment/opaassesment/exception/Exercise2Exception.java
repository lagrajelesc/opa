package com.opa.assesment.opaassesment.exception;

public class Exercise2Exception extends Exception {

    private String message;

    public Exercise2Exception(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
