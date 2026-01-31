package MiniCheckoutSystem;

import java.util.List;

public class RegularPolicy implements DiscountPolicy{
    @Override
    public double calculateDiscount(List<String> list) {
        return 0;
    }
}
