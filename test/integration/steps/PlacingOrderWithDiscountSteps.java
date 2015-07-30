package test.integration.steps;

import demo.domain.exception.OrderException;
import demo.domain.model.Order;
import demo.domain.model.OrderItem;
import demo.domain.model.Product;
import demo.application.service.OrderServiceImpl;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marek on 2015-04-23.
 */
public class PlacingOrderWithDiscountSteps extends Steps {
    private int customerId;
    private List<OrderItem> orderItems;
    private Order order;
    private OrderServiceImpl orderService;

    public PlacingOrderWithDiscountSteps() {
        customerId = 2;
        orderItems = new ArrayList<OrderItem>();
        orderService = new OrderServiceImpl();
    }

    @Given("I've chosen all products to buy")
    public void givenListOfItemsToOrder() {
        Product product1 = new Product(1, "Product 1", 4.99f);
        Product product2 = new Product(2, "Product 2", 7.45f);
        Product product3 = new Product(3, "Product 3", 13.99f);

        orderItems.add(new OrderItem(1, product1, 2));
        orderItems.add(new OrderItem(2, product2, 4));
        orderItems.add(new OrderItem(3, product3, 1));
    }

    @When("I click Order button")
    public void whenClickOrderButton() {
        order = orderService.createOrder(customerId, orderItems);
    }

    @Then("I want to see order summary")
    public void thenIShouldSeeOrderSummaryWithDiscount () throws OrderException {
        if (order == null) {
            throw new OrderException("Order is null");
        }

        if (order.getListOfOrderedItems().size() == 0) {
            throw new OrderException("Number of ordered items is 0");
        }

        if (order.calculateTotalValue(customerId) == 0.0f) {
            throw new OrderException("Total order value is 0.0");
        }

        //9.98 + 29,8 + 13,99 = 53.77 - 0.5
        float orderValue = Math.round(order.calculateTotalValue(customerId) * 100.0f) / 100.0f;
        if (orderValue != 53.27f)
            throw new OrderException("Calculated order value: " + orderValue + " don't match real order value");
    }
}
