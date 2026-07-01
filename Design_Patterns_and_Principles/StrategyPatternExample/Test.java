package StrategyPatternExample;

public class Test {

    public static void main(String[] args) {

        PaymentContext payment;

        payment = new PaymentContext(new CreditCardPayment());
        payment.executePayment(5000);

        payment = new PaymentContext(new PayPalPayment());
        payment.executePayment(3000);

    }

}