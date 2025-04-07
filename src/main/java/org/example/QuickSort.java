package org.example;

import java.util.List;

public class QuickSort {
    public static void ListQuickSort(List<Integer> numbers, int start, int end) {
        if(start < end) {
            int sortFlag = SplitListPoint(numbers, start, end);
            ListQuickSort(numbers, start, sortFlag-1);
            ListQuickSort(numbers, sortFlag+1, end);
        }
    }

    private static int SplitListPoint(List<Integer> numbers, int start, int end) {
        int compareNumber = numbers.get(end);
        int indexFlag = start - 1;
        for (int i = start; i < end; i++) {
            if(numbers.get(i) < compareNumber) {
                indexFlag++;
                SwapNumbers(numbers, indexFlag, i);
            }
        }
        indexFlag +=1;
        SwapNumbers(numbers, indexFlag, end);
        return indexFlag;
    }

    private static void SwapNumbers(List<Integer> numbers, int from, int to) {
        int temp = numbers.get(from);
        numbers.set(from, numbers.get(to));
        numbers.set(to, temp);
    }

}
