package AdapterPatternExample;

class StripeGateway {

    void pay(double amount) {
        System.out.println("Payment of " + amount + " processed through Stripe.");
    }

}