public class Queue {

        Node front;
        Node rear;

        Queue() {
            front = null;
            rear = null;
        }

        void enqueue(int data) {

            Node newNode = new Node(data);

            if (rear == null) {
                front = newNode;
                rear = newNode;
            }
            else {
                rear.next = newNode;
                rear = newNode;
            }

            System.out.println(data + " added to queue");
        }

        int dequeue() {

            if (front == null) {
                System.out.println("Queue is empty");
                return -1;
            }

            int value = front.data;

            front = front.next;

            if (front == null) {
                rear = null;
            }

            return value;
        }

        int peek() {

            if (front == null) {
                System.out.println("Queue is empty");
                return -1;
            }

            return front.data;
        }

        void display() {

            if (front == null) {
                System.out.println("Queue is empty");
                return;
            }

            Node temp = front;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            System.out.println();
        }
    }
