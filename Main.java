public class Main {

        public static void main(String[] args) {

            Queue queue = new Queue();

            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);

            System.out.println("\nQueue:");
            queue.display();

            System.out.println("\nFront element: " + queue.peek());

            System.out.println("Removed: " + queue.dequeue());

            System.out.println("\nQueue after dequeue:");
            queue.display();
        }
    }
