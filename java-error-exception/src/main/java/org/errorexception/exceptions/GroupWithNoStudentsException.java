package org.errorexception.exceptions;

public class GroupWithNoStudentsException extends RuntimeException {
    public GroupWithNoStudentsException() {
    }

    public GroupWithNoStudentsException(String message) {
        super(message);
    }

    public GroupWithNoStudentsException(String message, Throwable cause) {
        super(message, cause);
    }

    public GroupWithNoStudentsException(Throwable cause) {
        super(cause);
    }
}
