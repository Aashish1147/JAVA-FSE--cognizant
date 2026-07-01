//package Algorithms_Data _Structures.TaskManagementSystem;

class Task {
    int taskId;
    String taskName;
    String status;
    Task next;

    Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
        next = null;
    }
}

public class TaskManagementSystem {

    Task head = null;

    void addTask(int id, String name, String status) {
        Task newTask = new Task(id, name, status);

        if (head == null) {
            head = newTask;
        } else {
            Task temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newTask;
        }

        System.out.println("Task Added");
    }

    void searchTask(int id) {
        Task temp = head;

        while (temp != null) {
            if (temp.taskId == id) {
                System.out.println("Task Found");
                System.out.println(temp.taskId + " " + temp.taskName + " " + temp.status);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Task Not Found");
    }

    void traverseTasks() {
        if (head == null) {
            System.out.println("No Tasks");
            return;
        }

        Task temp = head;

        while (temp != null) {
            System.out.println(temp.taskId + " " + temp.taskName + " " + temp.status);
            temp = temp.next;
        }
    }

    void deleteTask(int id) {

        if (head == null) {
            System.out.println("List Empty");
            return;
        }

        if (head.taskId == id) {
            head = head.next;
            System.out.println("Task Deleted");
            return;
        }

        Task temp = head;

        while (temp.next != null && temp.next.taskId != id) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Task Not Found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Task Deleted");
        }
    }

    public static void main(String[] args) {

        TaskManagementSystem list = new TaskManagementSystem();

        list.addTask(1, "Design UI", "Pending");
        list.addTask(2, "Write Code", "In Progress");
        list.addTask(3, "Testing", "Pending");

        System.out.println("\nAll Tasks:");
        list.traverseTasks();

        System.out.println();

        list.searchTask(2);

        System.out.println();

        list.deleteTask(2);

        System.out.println("\nTasks After Deletion:");
        list.traverseTasks();
    }
}