public class Main {
    public static void main(String[] args) {
        ProductFactory productFactory = new ConcreteProductFactory();
        InventoryRepository repo = new HashMapInventoryRepository();
        InventoryManager manager = new InventoryManager(repo);

        Product p1 = productFactory.createProduct("P001", "Laptop", 10, 75000);
        Product p2 = productFactory.createProduct("P002", "Mouse", 100, 500);
        Product p3 = productFactory.createProduct("P003", "Keyboard", 50, 1200);

        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);

        System.out.println("Initial Inventory:");
        manager.displayInventory();

        manager.updateProduct("P002", "Scanner", 80, 800);

        System.out.println("\nAfter Update:");
        manager.displayInventory();

        manager.deleteProduct("P001");

        System.out.println("\nAfter Deletion:");
        manager.displayInventory();
    }
}
