package MiniCheckoutSystem;

import java.util.List;
import java.util.Map;

public class OrderValidator {

    public void validate(List<String> list, Map<Items, Double> map, Map<CustomerType, Double> customerDiscount, String customerType) throws Exception {
        for(String cur:list){
            if(!map.containsKey(cur))throw new Exception();
        }
        if(!customerDiscount.containsKey(customerType))throw new Exception();
    }
}
