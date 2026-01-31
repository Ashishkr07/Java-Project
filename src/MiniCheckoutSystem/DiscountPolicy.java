package MiniCheckoutSystem;

import java.util.List;

public interface DiscountPolicy {

    public double calculateDiscount(List<String> list);
}
