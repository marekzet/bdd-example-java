package test.unit.domain.policy;

import demo.domain.policy.DiscountPolicy;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Marek on 2015-04-23.
 */
public class DiscountPolicyTests {
    private final DiscountPolicy discountPolicy;

    public DiscountPolicyTests() {
        discountPolicy = new DiscountPolicy();
    }

    @Test
    public void should_add_discount_if_the_customer_id_is_even() {
        int customerId = 18;
        float expectedDiscount = 0.5f;

        float actualDiscount = discountPolicy.calculateDiscount(customerId);

        assertEquals(expectedDiscount, actualDiscount, 0);
    }
}
