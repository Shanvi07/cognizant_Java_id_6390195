public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment("1234567812345678"));
        context.payAmount(1700.50);

        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.payAmount(299.99);
    }
}
