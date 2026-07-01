package AdapterPatternExample;

class PayPalAdapter implements PaymentProcessor {

    private PayPalGateway gateway;

    PayPalAdapter() {
        gateway = new PayPalGateway();
    }

    public void processPayment(double amount) {
        gateway.makePayment(amount);
    }

}