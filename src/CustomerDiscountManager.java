public class CustomerDiscountManager {
    VIPCustomerService vipCustomerService;
    PremiumCustomerService premiumCustomerService;
    RegularCustomerService regularCustomerService;

    public CustomerDiscountManager(VIPCustomerService vipCustomerService, PremiumCustomerService premiumCustomerService, RegularCustomerService regularCustomerService) {
        this.vipCustomerService = vipCustomerService;
        this.premiumCustomerService = premiumCustomerService;
        this.regularCustomerService = regularCustomerService;
    }

}

