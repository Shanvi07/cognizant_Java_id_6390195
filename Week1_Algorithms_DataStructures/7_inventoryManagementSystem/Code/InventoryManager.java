public class InventoryManager {
    private final InventoryRepository repository;

    public InventoryManager(InventoryRepository repository) {
        this.repository = repository;
    }

    public void addProduct(Product product) {
        repository.addProduct(product);
    }

    public boolean updateProduct(String productId, String name, int qty, double price) {
        Product product = repository.getProduct(productId);
        if (product == null) return false;
        product.setProductName(name);
        product.setQuantity(qty);
        product.setPrice(price);
        return repository.updateProduct(product);
    }

    public boolean deleteProduct(String productId) {
        return repository.deleteProduct(productId);
    }

    public void displayInventory() {
        for (Product p : repository.getAllProducts()) {
            System.out.println(p);
        }
    }
}
