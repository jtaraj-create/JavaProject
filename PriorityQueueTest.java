public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();

        priorityQueue.enqueue("Normal task", 3);
        priorityQueue.enqueue("Urgent task", 1);
        priorityQueue.enqueue("Medium task", 2);

        if (priorityQueue.size() != 3) {
            throw new RuntimeException("Test failed: size should be 3.");
        }

        QueueItem first = priorityQueue.dequeue();
        if (!first.getItem().equals("Urgent task") || first.getPriority() != 1) {
            throw new RuntimeException("Test failed: urgent task should be removed first.");
        }

        QueueItem second = priorityQueue.dequeue();
        if (!second.getItem().equals("Medium task") || second.getPriority() != 2) {
            throw new RuntimeException("Test failed: medium task should be removed second.");
        }

        QueueItem third = priorityQueue.dequeue();
        if (!third.getItem().equals("Normal task") || third.getPriority() != 3) {
            throw new RuntimeException("Test failed: normal task should be removed third.");
        }

        if (!priorityQueue.isEmpty()) {
            throw new RuntimeException("Test failed: queue should be empty.");
        }

        System.out.println("All tests passed successfully!");
    }
}
