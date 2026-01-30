public class PremiumCustomerService implements DiscountService{
    @Override
    public double getDiscount(double amount) {
        return amount*1.0;
    }
}
