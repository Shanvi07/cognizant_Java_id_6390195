public class Main {
    public static void main(String[] args) {
        EmployeeRepository repo = new EmployeeRepository(5);
        EmployeeService service = new EmployeeService(repo);

        service.addEmployee(new Employee(101, "Divyanshu", "Engineer", 55000));
        service.addEmployee(new Employee(102, "Aryan", "Manager", 72000));
        service.addEmployee(new Employee(103, "Priya", "Analyst", 48000));

        service.printAllEmployees();

        System.out.println(" Searching for ID 102:");
        Employee found = service.searchById(102);
        System.out.println(found != null ? found : "Not found");

        System.out.println(" Deleting ID 101:");
        service.deleteEmployeeById(101);

        service.printAllEmployees();
    }
}
