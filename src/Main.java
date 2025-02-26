public class Main {

    public static class IntList {

        private Node head;
        private int size;

        public IntList() {
            this.head = null;
            size = 0;
        }

        private class Node {
            int value;
            Node next;

            Node(int value) {
                this.value = value;
                this.next = null;
            }
        }

        public void add(int value) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
            size++;
        }

        public int get(int index) throws IndexOutOfBoundsException {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index out of bounds: " + index);
            }
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.value;
        }

        public void remove(int index) throws IndexOutOfBoundsException {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index out of bounds: " + index);
            }
            if (index == 0) {
                head = head.next;
            } else {
                Node current = head;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                current.next = current.next.next;
            }
            size--;
        }

        public int size() {
            return size;
        }

        public void print() {
            Node current = head;
            while (current != null) {
                System.out.print(current.value + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        IntList container = new IntList();
        container.add(10);
        container.add(20);
        container.add(30);
        container.print(); // Output: 10 20 30

        System.out.println("Element at index 1: " + container.get(1)); // Output: 20

        container.remove(1);
        container.print(); // Output: 10 30

        System.out.println("Size: " + container.size()); // Output: 2
    }
}