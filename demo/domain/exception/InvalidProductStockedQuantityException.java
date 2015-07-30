package demo.domain.exception;

/**
 * Created by Marek on 2015-04-23.
 */
public class InvalidProductStockedQuantityException extends Exception {
    public InvalidProductStockedQuantityException(String message) {
        super(message);
    }
}
