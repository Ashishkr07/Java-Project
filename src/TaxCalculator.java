import java.util.HashMap;
import java.util.Map;

public class TaxCalculator {

    Map<CountryCode, Double> map = new HashMap<>();


    public double calculate(String countryCode, double amount){
        return amount*(map.get(countryCode.toString()));
    }
}

enum CountryCode{
    IN,
    USA,
    GER
}