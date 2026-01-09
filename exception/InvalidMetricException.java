package org.app.pooexcepciones.ejemplo.exception;

public class InvalidMetricException extends Exception {

    public InvalidMetricException(String message) {
        super(message);
    }

    public InvalidMetricException(String message, Throwable cause) {
        super(message, cause);
    }
}
