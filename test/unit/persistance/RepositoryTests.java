package test.unit.persistance;

import demo.domain.model.Order;
import demo.domain.model.OrderItem;
import demo.domain.model.Product;
import demo.domain.repository.BaseRepository;
import demo.persistance.OrderItemRepository;
import demo.persistance.OrderRepository;
import demo.persistance.ProductRepository;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by Marek on 2015-04-23.
 */
public class RepositoryTests {
    @Test
    public void should_create_instance_of_the_Order_Repository() {
        BaseRepository<Order> orderRepository = new OrderRepository();
        assertNotNull(orderRepository);
    }

    @Test
    public void should_create_instance_of_the_Order_Item_Repository() {
        BaseRepository<OrderItem> orderItemRepository = new OrderItemRepository();
        assertNotNull(orderItemRepository);
    }

    @Test
    public void should_create_instance_of_the_Product_repository() {
        BaseRepository<Product> productRepository = new ProductRepository();
        assertNotNull(productRepository);
    }
}
