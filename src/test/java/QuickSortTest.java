import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.example.QuickSort.ListQuickSort;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickSortTest {

    @Test
    public void testListQuickSort1() {
        List<Integer> numbers = new ArrayList<>(List.of(12, 9, 14, 11, 6, 21, 19, 15, 4, 22));
        ListQuickSort(numbers, 0, numbers.size() -1);
        List<Integer> expected = List.of(4, 6, 9, 11, 12, 14, 15, 19, 21, 22);
        assertEquals(expected, numbers);
    }

    @Test
    public void testListQuickSort2() {
        List<Integer> numbers = new ArrayList<>(List.of(7, 10, 15, 3, 5, 9, 11, 16, 12, 8));
        ListQuickSort(numbers, 0, numbers.size() -1);
        List<Integer> expected = List.of(3, 5, 7, 8, 9, 10, 11, 12, 15, 16);
        assertEquals(expected, numbers);
    }

    @Test
    public void testListQuickSort3() {
        List<Integer> numbers = new ArrayList<>(List.of(-10, 6, 99, 31, 15, 29, 11, 26, 12, 18));
        ListQuickSort(numbers, 0, numbers.size() -1);
        List<Integer> expected = List.of(-10, 6, 11, 12, 15, 18, 26, 29, 31, 99);
        assertEquals(expected, numbers);
    }

}
