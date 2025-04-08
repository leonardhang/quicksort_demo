package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(10);
        System.out.print("请输入10个整数, 以空格分割:");
        boolean inputValid = false;
        Scanner scanner = new Scanner(System.in);
        while (!inputValid) {
            String inputText = scanner.nextLine();
            String[] inputNumbers = inputText.split("\\s+");
            try {
                if(inputNumbers.length != 10) {
                    System.out.print("输入的整数数量不是10个，请重新输入10个整数, 以空格分割：");
                    continue;
                }
                for (String input : inputNumbers) {
                    numbers.add(Integer.parseInt(input));
                }
                inputValid = true;
            }catch (NumberFormatException e) {
                System.out.print("输入的不是数字，请重新输入10个整数, 以空格分割：");
            }
        }
        QuickSort.ListQuickSort(numbers, 0, numbers.size() -1);
        String sortedNumberStr = numbers.stream().map(String:: valueOf).collect(Collectors.joining(" "));
        System.out.print("排序后的数字："+ sortedNumberStr);
        scanner.close();
    }
}