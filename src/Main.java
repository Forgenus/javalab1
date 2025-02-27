
public class Main {

    /**
     * Main method to demonstrate adding, removing, and accessing elements in the IntList.
     */
    public static void main(String[] args) {
        IntList container = new IntList();
        container.add(10);
        container.add(20);
        container.add(30);
        container.print();

        System.out.println("Element at index 1: " + container.get(1));

        container.remove(1);
        container.print();

        System.out.println("Size: " + container.size());
    }
}