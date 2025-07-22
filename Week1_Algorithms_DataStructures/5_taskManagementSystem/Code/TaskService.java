public class TaskService {
    private final TaskLinkedList taskList = new TaskLinkedList();

    public void add(int id, String name, String status) {
        taskList.addTask(new Task(id, name, status));
    }

    public void showAll() {
        taskList.traverseTasks();
    }

    public void find(int id) {
        Task task = taskList.searchTask(id);
        if (task != null) System.out.println("Found: " + task);
        else System.out.println("Task not found.");
    }

    public void remove(int id) {
        boolean deleted = taskList.deleteTask(id);
        System.out.println(deleted ? "Task deleted." : "Task not found.");
    }
}
