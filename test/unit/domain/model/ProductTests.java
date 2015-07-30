package test.unit.domain.model;

import demo.domain.exception.InvalidProductNameException;
import demo.domain.exception.InvalidProductStockedQuantityException;
import demo.domain.exception.InvalidProductUnitPriceException;
import demo.domain.model.Product;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Marek on 2015-04-23.
 */
public class ProductTests {
    @Test
    public void should_increase_stocked_quantity_of_the_product() throws InvalidProductStockedQuantityException {
        Product product = new Product(1, "Test product", 6.99f, 9);

        int expectedStockedQuantity = 12;
        int actualStockedQuantity = product.increaseStockedQuantity(3);

        assertEquals(expectedStockedQuantity, actualStockedQuantity);
    }

    @Test
    public void should_update_product_with_new_values() throws InvalidProductUnitPriceException, InvalidProductNameException {
        Product product = new Product(1, "Test product", 6.99f);

        Product newProduct = product.editProduct("New name", 8.99f);

        assertEquals("New name", newProduct.getName());
        assertEquals(8.99f, newProduct.getUnitPrice(), 0);
    }
}
