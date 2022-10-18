package org.errorexception.exceptions;

public class StudentWithNoSuchSubjectException extends RuntimeException {
    public StudentWithNoSuchSubjectException() {
    }

    public StudentWithNoSuchSubjectException(String message) {
        super(message);
    }

    public StudentWithNoSuchSubjectException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentWithNoSuchSubjectException(Throwable cause) {
        super(cause);
    }
}
