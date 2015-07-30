package demo.domain.policy;

/**
 * Created by Marek on 2015-04-23.
 */
public class DiscountPolicy {
    public float calculateDiscount(int customerId) {
        if (customerId % 2 == 0)
            return 0.5f;

        return 0.0f;
    }
}