/**
 * A simple linked list implementation for integers.
 */
public class IntList {

    private Node head;
    private int size;

    /**
     * Constructs an empty list.
     */
    public IntList() {
        this.head = null;
        size = 0;
    }

    /**
     * A node in the linked list.
     */
    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    /**
     * Adds a new integer to the end of the list.
     *
     * @param value The integer to add.
     */
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

    /**
     * Returns the integer at the specified position in the list.
     *
     * @param index The index of the integer to return.
     * @return The integer at the specified position in the list.
     * @throws IndexOutOfBoundsException If the index is out of range.
     */
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

    /**
     * Removes the integer at the specified position in the list.
     *
     * @param index The index of the integer to remove.
     * @throws IndexOutOfBoundsException If the index is out of range.
     */
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

    /**
     * Returns the number of integers in the list.
     *
     * @return The number of integers in the list.
     */
    public int size() {
        return size;
    }

    /**
     * Prints the integers in the list to the console.
     */
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}