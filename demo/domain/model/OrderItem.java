package demo.domain.model;

/**
 * Created by Marek on 2015-04-23.
 */
public class OrderItem extends AggregateRoot {
    private Product product;
    private int quantity;
    private float value;

    public OrderItem(int id, Product product, int quantity) {
        super(id);
        this.product = product;
        this.quantity = quantity;
        value = product.getUnitPrice() * quantity;
    }

    public float getValue() {
        return value;
    }
}
