import java.util.ArrayList;

public class PriorityQueue {
    private ArrayList<QueueItem> heap;

    public PriorityQueue() {
        heap = new ArrayList<>();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public int size() {
        return heap.size();
    }

    public void enqueue(String item, int priority) {
        QueueItem newItem = new QueueItem(item, priority);
        heap.add(newItem);
        heapifyUp(heap.size() - 1);
    }

    public QueueItem dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot dequeue from an empty priority queue.");
        }

        if (heap.size() == 1) {
            return heap.remove(0);
        }

        QueueItem highestPriorityItem = heap.get(0);
        QueueItem lastItem = heap.remove(heap.size() - 1);
        heap.set(0, lastItem);
        heapifyDown(0);

        return highestPriorityItem;
    }

    public QueueItem peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot peek from an empty priority queue.");
        }

        return heap.get(0);
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Priority queue is empty.");
            return;
        }

        System.out.println("Current Priority Queue:");
        for (QueueItem queueItem : heap) {
            System.out.println(queueItem);
        }
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;

            if (heap.get(index).getPriority() < heap.get(parentIndex).getPriority()) {
                swap(index, parentIndex);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    private void heapifyDown(int index) {
        int smallest = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;

        if (leftChild < heap.size()
                && heap.get(leftChild).getPriority() < heap.get(smallest).getPriority()) {
            smallest = leftChild;
        }

        if (rightChild < heap.size()
                && heap.get(rightChild).getPriority() < heap.get(smallest).getPriority()) {
            smallest = rightChild;
        }

        if (smallest != index) {
            swap(index, smallest);
            heapifyDown(smallest);
        }
    }

    private void swap(int firstIndex, int secondIndex) {
        QueueItem temp = heap.get(firstIndex);
        heap.set(firstIndex, heap.get(secondIndex));
        heap.set(secondIndex, temp);
    }
}
