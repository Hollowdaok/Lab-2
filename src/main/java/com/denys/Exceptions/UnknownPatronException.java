package com.denys.Exceptions;

public class UnknownPatronException extends RuntimeException {
    public UnknownPatronException(String errorMessage) {
        super(errorMessage);
    }

    public UnknownPatronException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}