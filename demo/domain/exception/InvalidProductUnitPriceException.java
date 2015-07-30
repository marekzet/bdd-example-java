package demo.domain.exception;

/**
 * Created by Marek on 2015-04-23.
 */
public class InvalidProductUnitPriceException extends Exception {
    public InvalidProductUnitPriceException(String message) {
        super(message);
    }
}
