package ObserverPatternExample;

import java.util.ArrayList;

class StockMarket implements Stock {

    private ArrayList<Observer> observers = new ArrayList<>();
    private double price;

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void deregister(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }

    void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

}