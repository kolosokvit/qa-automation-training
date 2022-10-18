package org.errorexception.exceptions;

public class UniversityWithNoFacultiesException extends RuntimeException {
    public UniversityWithNoFacultiesException() {
    }

    public UniversityWithNoFacultiesException(String message) {
        super(message);
    }

    public UniversityWithNoFacultiesException(String message, Throwable cause) {
        super(message, cause);
    }

    public UniversityWithNoFacultiesException(Throwable cause) {
        super(cause);
    }
}
