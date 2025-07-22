import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapInventoryRepository implements InventoryRepository {
    private final Map<String, Product> inventory = new HashMap<>();

    @Override
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    @Override
    public boolean updateProduct(Product product) {
        if (!inventory.containsKey(product.getProductId())) return false;
        inventory.put(product.getProductId(), product);
        return true;
    }

    @Override
    public boolean deleteProduct(String productId) {
        return inventory.remove(productId) != null;
    }

    @Override
    public Product getProduct(String productId) {
        return inventory.get(productId);
    }

    @Override
    public Collection<Product> getAllProducts() {
        return inventory.values();
    }
}
