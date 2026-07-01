package ObserverPatternExample;

public class Test {

    public static void main(String[] args) {

        StockMarket market = new StockMarket();

        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        market.register(mobile);
        market.register(web);

        System.out.println("Stock Price Changed:");

        market.setPrice(2500);

    }

}