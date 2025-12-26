import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    static ArrayList<String> tasks = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Task Manager CLI ---");
            System.out.println("1. Add Task");
            System.out.println("2. Show Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    showTasks();
                    break;
                case 3:
                    deleteTask();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    // Features will be implemented by team members
    static void addTask() { 

    System.out.print("Enter task: "); 

    String task = sc.nextLine(); 

    tasks.add(task); 

    System.out.println("Task added successfully."); 

} 

    static void showTasks() {}
    static void deleteTask() {
    showTasks();
    if (tasks.isEmpty()) return;

    System.out.print("Enter task number to delete: ");
    int index = sc.nextInt();
    sc.nextLine();

    if (index > 0 && index <= tasks.size()) {
        tasks.remove(index - 1);
        System.out.println("Task deleted.");
    } else {
        System.out.println("Invalid number.");
    }
}
}
