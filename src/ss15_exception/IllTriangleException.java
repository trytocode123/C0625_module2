package ss15_exception;

public class IllTriangleException extends Exception {
    public IllTriangleException() {
    }

    public IllTriangleException(String message) {
        super(message);
    }

    public IllTriangleException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllTriangleException(Throwable cause) {
        super(cause);
    }

    public IllTriangleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
