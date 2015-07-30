package demo.domain.model;

import demo.domain.exception.InvalidProductNameException;
import demo.domain.exception.InvalidProductStockedQuantityException;
import demo.domain.exception.InvalidProductUnitPriceException;

/**
 * Created by Marek on 2015-04-23.
 */
public class Product extends AggregateRoot {
    private String name;
    private float unitPrice;
    private int stockedQuantity;

    public Product(int id, String name, float price) {
        super(id);
        this.name = name;
        this.unitPrice = price;
    }

    public Product(int id, String name, float unitPrice, int stockedQuantity) {
        super(id);
        this.name = name;
        this.unitPrice = unitPrice;
        this.stockedQuantity = stockedQuantity;
    }

    public String getName() {
        return name;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public int increaseStockedQuantity(int stockedQuantity) throws InvalidProductStockedQuantityException {
        if (stockedQuantity < 0) {
            throw new InvalidProductStockedQuantityException("New quantity cannot be lower than 0.");
        }

        this.stockedQuantity += stockedQuantity;

        return this.stockedQuantity;
    }

    public Product editProduct(String name, float unitPrice) throws InvalidProductNameException, InvalidProductUnitPriceException {
        if (name.isEmpty()) {
            throw new InvalidProductNameException("Name cannot be empty");
        }

        if (unitPrice < 0) {
            throw new InvalidProductUnitPriceException("New unitPrice cannot be lower than 0.");
        }

        this.name = name;
        this.unitPrice = unitPrice;

        return this;
    }
}