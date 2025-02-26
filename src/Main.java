public class Main {


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