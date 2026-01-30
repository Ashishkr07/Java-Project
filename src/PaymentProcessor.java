public class PaymentProcessor {

    PaymentCalculator paymentCalculator;
    PaymentLogger paymentLogger;

    public PaymentProcessor(PaymentCalculator paymentCalculator, PaymentLogger paymentLogger) {
        this.paymentCalculator = paymentCalculator;
        this.paymentLogger = paymentLogger;
    }

    public void getAndPrintPayment(int time){
        paymentLogger.logSteps(paymentCalculator.getPayment(time));
    }
}
