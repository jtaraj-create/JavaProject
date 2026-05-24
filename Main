import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Priority Queue Menu =====");
            System.out.println("1. Enqueue item");
            System.out.println("2. Dequeue highest-priority item");
            System.out.println("3. Peek highest-priority item");
            System.out.println("4. Display queue");
            System.out.println("5. Check size");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice;

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException error) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter item/task name: ");
                    String item = scanner.nextLine();

                    System.out.print("Enter priority number. Smaller number = higher priority: ");

                    try {
                        int priority = Integer.parseInt(scanner.nextLine());
                        priorityQueue.enqueue(item, priority);
                        System.out.println("Added '" + item + "' with priority " + priority + ".");
                    } catch (NumberFormatException error) {
                        System.out.println("Priority must be an integer.");
                    }
                    break;

                case 2:
                    try {
                        QueueItem removedItem = priorityQueue.dequeue();
                        System.out.println("Removed: " + removedItem);
                    } catch (IllegalStateException error) {
                        System.out.println(error.getMessage());
                    }
                    break;

                case 3:
                    try {
                        QueueItem topItem = priorityQueue.peek();
                        System.out.println("Highest-priority item: " + topItem);
                    } catch (IllegalStateException error) {
                        System.out.println(error.getMessage());
                    }
                    break;

                case 4:
                    priorityQueue.display();
                    break;

                case 5:
                    System.out.println("Queue size: " + priorityQueue.size());
                    break;

                case 6:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
