package test.unit.domain.model;

import demo.domain.model.OrderItem;
import demo.domain.model.Product;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Marek on 2015-04-23.
 */
public class OrderItemTests {
    @Test
    public void should_return_correct_value_of_order_item() {
        Product product = new Product(1, "Test product", 9.99f);
        OrderItem item = new OrderItem(1, product, 4);

        float expectedOrderItemValue = 39.96f;
        float actualOrderItemValue = item.getValue();

        assertEquals(expectedOrderItemValue, actualOrderItemValue, 0);
    }
}
