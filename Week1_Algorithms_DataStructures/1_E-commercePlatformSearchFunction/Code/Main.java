public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Footwear"),
            new Product(103, "Phone", "Electronics"),
            new Product(104, "Watch", "Accessories")
        };

        System.out.println("Linear Search:");
        int index1 = LinearSearch.search(products, "Phone");
         if (index1 != -1) {
            System.out.println("Found: " + products[index1]);
        } else {
            System.out.println("Product not found");
        }


        System.out.println("\nBinary Search:");
        BinarySearch.sortProductsByName(products); 
        int index2 = BinarySearch.search(products, "Shoes");
          if (index2 != -1) {
            System.out.println("Found: " + products[index2]);
        } else {
            System.out.println("Product not found");
        }

        System.out.println("\nBinary Search:");
        BinarySearch.sortProductsByName(products); 
        int index3 = BinarySearch.search(products, "Clothes");
          if (index3 != -1) {
            System.out.println("Found: " + products[index3]);
        } else {
            System.out.println("Product not found");
        }
    }
}
