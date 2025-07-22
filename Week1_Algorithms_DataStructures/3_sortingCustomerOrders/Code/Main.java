import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Order[] orders = {
            new Order("O1", "Divyanshu", 999.99),
            new Order("O2", "Aryan", 2400.00),
            new Order("O3", "Priya", 150.50),
            new Order("O4", "Ravi", 3999.00)
        };

        System.out.println(" Before Sorting:");
        printOrders(orders);

        System.out.print("Choose sorting method (1 = Bubble Sort, 2 = Quick Sort): ");
        int choice = sc.nextInt();
        sc.close();

        switch (choice) {
            case 1:
                BubbleSort.sort(orders);
                break;
            case 2:
                QuickSort.sort(orders, 0, orders.length - 1);
                break;
            default:
                System.out.println("Invalid choice. No sorting applied.");
        }

        System.out.println("After Sorting by Total Price (Descending):");
        printOrders(orders);
    }

    static void printOrders(Order[] orders) {
        for (Order o : orders) {
            System.out.println(o);
        }
    }
}
