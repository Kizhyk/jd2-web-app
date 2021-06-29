package com.kizhyk.service.exception;

public class ServiceIllegalArgumentException extends Exception {
    public ServiceIllegalArgumentException() {
    }

    public ServiceIllegalArgumentException(String message) {
        super(message);
    }

    public ServiceIllegalArgumentException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceIllegalArgumentException(Throwable cause) {
        super(cause);
    }

    public ServiceIllegalArgumentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
