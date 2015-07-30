package demo.application.api;

import demo.domain.model.Order;
import demo.domain.model.OrderItem;

import java.util.List;

/**
 * Created by Marek on 2015-04-24.
 */
public interface OrderService {
    Order createOrder(int customerId, List<OrderItem> orderItems);
}
