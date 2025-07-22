public class Main {
    public static void main(String[] args) {
        TaskService service = new TaskService();

        service.add(1, "Design System", "Pending");
        service.add(2, "Write Code", "In Progress");
        service.add(3, "Test Application", "Pending");

        System.out.println("All Tasks:");
        service.showAll();

        System.out.println("\nSearch Task ID 2:");
        service.find(2);

        System.out.println("\nDelete Task ID 1:");
        service.remove(1);

        System.out.println("\nRemaining Tasks:");
        service.showAll();
    }
}
