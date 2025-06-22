public class ConcreteProductFactory implements ProductFactory {
    @Override
    public Product createProduct(String id, String name, int quantity, double price) {
        return new Product(id, name, quantity, price);
    }
}
