import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class IntListTest {

    @Test
    public void testAdd() {
        IntList list = new IntList();
        list.add(10);
        list.add(20);
        list.add(30);
        assertEquals(3, list.size());
        assertEquals(10, list.get(0));
        assertEquals(20, list.get(1));
        assertEquals(30, list.get(2));
    }

    @Test
    public void testGet() {
        IntList list = new IntList();
        list.add(10);
        list.add(20);
        list.add(30);
        assertEquals(10, list.get(0));
        assertEquals(20, list.get(1));
        assertEquals(30, list.get(2));
    }

    @Test
    public void testGetInvalidIndex() {
        IntList list = new IntList();
        list.add(10);
        list.add(20);
        list.add(30);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(3);
        });
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(-1);
        });
    }

    @Test
    public void testRemove() {
        IntList list = new IntList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(1);
        assertEquals(2, list.size());
        assertEquals(10, list.get(0));
        assertEquals(30, list.get(1));
    }

    @Test
    public void testRemoveInvalidIndex() {
        IntList list = new IntList();
        list.add(10);
        list.add(20);
        list.add(30);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.remove(3);
        });
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.remove(-1);
        });
    }

    @Test
    public void testSize() {
        IntList list = new IntList();
        assertEquals(0, list.size());
        list.add(10);
        assertEquals(1, list.size());
        list.add(20);
        assertEquals(2, list.size());
        list.remove(0);
        assertEquals(1, list.size());
    }
}