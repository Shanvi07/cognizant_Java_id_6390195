public class EmployeeService {
    private EmployeeRepository repo;

    public EmployeeService(EmployeeRepository repo) {
        this.repo = repo;
    }

    public void addEmployee(Employee e) {
        if (repo.add(e)) {
            System.out.println(" Employee added.");
        } else {
            System.out.println(" Employee array is full.");
        }
    }

    public void deleteEmployeeById(int id) {
        int index = repo.findIndexById(id);
        if (repo.deleteByIndex(index)) {
            System.out.println(" Employee deleted.");
        } else {
            System.out.println(" Employee not found.");
        }
    }

    public Employee searchById(int id) {
        int index = repo.findIndexById(id);
        return repo.getByIndex(index);
    }

    public void printAllEmployees() {
        Employee[] employees = repo.getAll();
        System.out.println(" Employee List:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
