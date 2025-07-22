import java.util.Collection;

public interface InventoryRepository {
    void addProduct(Product product);
    boolean updateProduct(Product product);
    boolean deleteProduct(String productId);
    Product getProduct(String productId);
    Collection<Product> getAllProducts();
}
