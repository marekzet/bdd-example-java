package demo.domain.exception;

/**
 * Created by Marek on 2015-04-23.
 */
public class InvalidProductNameException extends Exception {
    public InvalidProductNameException(String message) {
        super(message);
    }
}
