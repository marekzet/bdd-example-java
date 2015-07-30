package demo.domain.model;

import demo.domain.policy.DiscountPolicy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marek on 2015-04-23.
 */
public class Order extends AggregateRoot {
    private final DiscountPolicy discountPolicy = new DiscountPolicy();

    private Customer customer;
    private List<OrderItem> items;
    private float totalValue;

    public Order(int id, Customer customer) {
        super(id);
        this.customer = customer;
        items = new ArrayList<OrderItem>();
        totalValue = 0.0f;
    }

    public List<OrderItem> addItemToOrder(OrderItem item) {
        items.add(item);
        return items;
    }

    public List<OrderItem> getListOfOrderedItems() {
        return items;
    }

    public float calculateTotalValue(int customerId) {
        float totalValue = 0.0f;

        for (OrderItem item : items) {
            totalValue += item.getValue();
        }

        float discountValue = discountPolicy.calculateDiscount(customerId);
        if (discountValue != 0.0f)
            return totalValue - discountValue;

        return totalValue;

    }
}
