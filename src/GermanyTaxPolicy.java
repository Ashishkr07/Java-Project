public class GermanyTaxPolicy implements TaxPolicy{

    TaxCalculator taxCalculator = new TaxCalculator();


    @Override
    public double getAmount(String countryCode,double amount) {
        return taxCalculator.calculate(countryCode,amount);
    }
}
