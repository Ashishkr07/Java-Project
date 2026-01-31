package MiniCheckoutSystem;

import java.util.List;

public class PremiumPolicy implements DiscountPolicy{
    @Override
    public double calculateDiscount(List<String> list) {
        return 0;
    }
}
