package org.errorexception.exceptions;

public class NoStudentsWithSubjectException extends RuntimeException {
    public NoStudentsWithSubjectException() {
    }

    public NoStudentsWithSubjectException(String message) {
        super(message);
    }

    public NoStudentsWithSubjectException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoStudentsWithSubjectException(Throwable cause) {
        super(cause);
    }
}
