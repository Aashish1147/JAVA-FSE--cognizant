package StrategyPatternExample;

class PaymentContext {

    private PaymentStrategy strategy;

    PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    void executePayment(double amount) {
        strategy.pay(amount);
    }

}