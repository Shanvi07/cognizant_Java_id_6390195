public class Order {
    public String orderId;
    public String customerName;
    public double totalPrice;

    public Order(String orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return customerName + " - " + orderId + " : Rs." + totalPrice;
    }
}
