package org.errorexception.exceptions;

public class FacultyWithNoGroupsException extends RuntimeException {
    public FacultyWithNoGroupsException() {
    }

    public FacultyWithNoGroupsException(String message) {
        super(message);
    }

    public FacultyWithNoGroupsException(String message, Throwable cause) {
        super(message, cause);
    }

    public FacultyWithNoGroupsException(Throwable cause) {
        super(cause);
    }
}
