package day61_exceptions.exceptions;

public class BreakTimeException extends RuntimeException {
    public BreakTimeException() {
    }

    public BreakTimeException(String message) {
        super(message);
    }
}
