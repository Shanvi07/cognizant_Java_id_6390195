public class TaskLinkedList {
    private TaskNode head;

    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode current = head;
            while (current.next != null) current = current.next;
            current.next = newNode;
        }
    }

    public Task searchTask(int id) {
        TaskNode current = head;
        while (current != null) {
            if (current.task.taskId == id) return current.task;
            current = current.next;
        }
        return null;
    }

    public boolean deleteTask(int id) {
        if (head == null) return false;
        if (head.task.taskId == id) {
            head = head.next;
            return true;
        }

        TaskNode current = head;
        while (current.next != null && current.next.task.taskId != id) {
            current = current.next;
        }

        if (current.next == null) return false;

        current.next = current.next.next;
        return true;
    }

    public void traverseTasks() {
        TaskNode current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }
}
