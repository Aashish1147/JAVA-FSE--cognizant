package AdapterPatternExample;

class StripeAdapter implements PaymentProcessor {

    private StripeGateway gateway;

    StripeAdapter() {
        gateway = new StripeGateway();
    }

    public void processPayment(double amount) {
        gateway.pay(amount);
    }

}