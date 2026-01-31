package MiniCheckoutSystem;

import java.util.List;
import java.util.Map;

public class OrderHandlerService {

    private Map<Items,Double> itemPrice;
    private Map<CustomerType,Double> customerDiscount;
    private DiscountPolicy discountPolicy;
    OrderValidator orderValidator;



    public boolean handle(List<String> list,String customerType){
        try{
            orderValidator.validate(list, itemPrice,customerDiscount,customerType);
            double amount = discountPolicy.calculateDiscount(list);
        }catch(Exception e){
            return false;
        }
        return true;
    }
}
