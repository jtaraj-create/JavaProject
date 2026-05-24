# Priority Queue Project in Java

## Topic
Priority Queues

## Description
This project implements a Priority Queue in Java using a Min-Heap data structure.

A priority queue is a data structure where every element has a priority.
The element with the highest priority is removed first.

In this project:
- Smaller priority number = higher priority
- Example: priority 1 is served before priority 4

## Files
- `PriorityQueue.java` — implementation of the priority queue using a min-heap
- `QueueItem.java` — class representing an item and its priority
- `Main.java` — menu-based program to test the priority queue
- `PriorityQueueTest.java` — simple test file
- `sample_output.txt` — example output

## Operations Implemented
1. Enqueue — insert an item with a priority
2. Dequeue — remove the item with the highest priority
3. Peek — view the highest-priority item without removing it
4. isEmpty — check if the queue is empty
5. size — return the number of elements
6. display — print the priority queue

## How to Compile

```bash
javac *.java
```

## How to Run the Main Program

```bash
java Main
```

## How to Run the Test

```bash
java PriorityQueueTest
```

## Time Complexity

| Operation | Time Complexity |
|---|---|
| Enqueue | O(log n) |
| Dequeue | O(log n) |
| Peek | O(1) |
| isEmpty | O(1) |
| Size | O(1) |

## Note
This project uses a Min-Heap. The item with the smallest priority number is removed first.
