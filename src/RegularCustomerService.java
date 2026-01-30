public class RegularCustomerService implements DiscountService{

    @Override
    public double getDiscount(double amount) {
        return amount*0.05;
    }
}
