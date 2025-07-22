public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobileUser1 = new MobileApp("Alice");
        Observer webUser1 = new WebApp("Bob");

        market.registerObserver(mobileUser1);
        market.registerObserver(webUser1);

        market.setStock("TCS", 3450.75);
        market.setStock("INFY", 1587.50);

        market.deregisterObserver(mobileUser1);

        market.setStock("WIPRO", 422.10); 
    }
}
