package ObserverPatternExample;

class WebApp implements Observer {

    public void update(double price) {
        System.out.println("Web App: Stock Price = " + price);
    }

}