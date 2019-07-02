package com.komarov884.vocabulator.exception;

/**
 * DocumentNotFoundException.
 *
 * @author Vasilii_Komarov
 */
public class DocumentNotFoundException extends RuntimeException {

    public DocumentNotFoundException() {
    }

    public DocumentNotFoundException(String message) {
        super(message);
    }

    public DocumentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public DocumentNotFoundException(Throwable cause) {
        super(cause);
    }

}
