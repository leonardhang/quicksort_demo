import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.example.QuickSort.ListQuickSort;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickSortTest {

    @Test
    public void testListQuickSort() {
        List<Integer> numbers = new ArrayList<>(List.of(12, 9, 14, 11, 6, 21, 19, 15, 4, 22));
        ListQuickSort(numbers, 0, numbers.size() -1);
        List<Integer> expected = new ArrayList<>(List.of(4, 6, 9, 11, 12, 14, 15, 19, 21, 22));
        assertEquals(expected, numbers);
    }

}
