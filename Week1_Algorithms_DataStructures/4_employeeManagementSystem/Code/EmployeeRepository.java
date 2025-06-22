public class EmployeeRepository {
    private Employee[] employees;
    private int size;

    public EmployeeRepository(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    public boolean add(Employee e) {
        if (size < employees.length) {
            employees[size++] = e;
            return true;
        }
        return false;
    }

    public Employee[] getAll() {
        Employee[] active = new Employee[size];
        for (int i = 0; i < size; i++) {
            active[i] = employees[i];
        }
        return active;
    }

    public int findIndexById(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == id) return i;
        }
        return -1;
    }

    public boolean deleteByIndex(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                employees[i] = employees[i + 1];
            }
            employees[--size] = null;
            return true;
        }
        return false;
    }

    public Employee getByIndex(int index) {
        if (index >= 0 && index < size) {
            return employees[index];
        }
        return null;
    }
}
