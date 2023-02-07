package fr.akoubayo.proxyvotingapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.MULTIPLE_CHOICES)

public class MultipleChoicesException  extends RuntimeException {
    public MultipleChoicesException() {
        super();
    }
    public MultipleChoicesException(String message, Throwable cause) {
        super(message, cause);
    }
    public MultipleChoicesException(String message) {
        super(message);
    }
    public MultipleChoicesException(Throwable cause) {
        super(cause);
    }
}
