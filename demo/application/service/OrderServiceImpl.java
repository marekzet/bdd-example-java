package demo.application.service;

import demo.domain.model.Customer;
import demo.domain.model.Order;
import demo.domain.model.OrderItem;
import demo.domain.repository.BaseRepository;
import demo.persistance.CustomerRepository;
import demo.persistance.OrderRepository;

import java.util.List;

/**
 * Created by Marek on 2015-04-23.
 */
public class OrderServiceImpl implements demo.application.api.OrderService {
    private final BaseRepository<Order> orderRepository;
    private final BaseRepository<Customer> customerRepository;

    public OrderServiceImpl() {
        orderRepository = new OrderRepository();
        customerRepository = new CustomerRepository();
    }

    @Override
    public Order createOrder(int customerId, List<OrderItem> orderItems) {
        Customer customer = customerRepository.Get(customerId);

        Order order = new Order(1, customer);

        for (OrderItem item : orderItems) {
            order.addItemToOrder(item);
        }

        orderRepository.Add(order);
        orderRepository.Save();

        return order;
    }
}
