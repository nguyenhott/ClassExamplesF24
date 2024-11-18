import java.util.Comparator;
import java.util.PriorityQueue;

public class TaskSchedulingExample {

    public static void main(String[] args) {
        PriorityQueue<Task> taskQueue = new PriorityQueue<Task>(Comparator.comparingInt(task -> task.priority));

        taskQueue.add(new Task("Fix bugs", 2));
        taskQueue.add(new Task("Write documentation", 3));
        taskQueue.add(new Task("Implement feature", 1));

        // Print the PriorityQueue
        System.out.println("PriorityQueue (Custom Task Ordering): " + taskQueue);

        // Remove tasks in priority order
        System.out.println("Processing tasks in priority order:");
        while (!taskQueue.isEmpty()) {
            System.out.println(taskQueue.poll());
        }
    }
}
