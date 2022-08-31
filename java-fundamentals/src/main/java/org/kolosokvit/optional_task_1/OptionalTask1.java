package org.kolosokvit.optional_task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OptionalTask1 {
    public static void main(String[] args) {
        System.out.println("Enter your numbers, each number on a new line:");
        ArrayList<String> array = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();
            if (s.equals("")) {
                break;
            } else {
                array.add(s);
            }
        }
        System.out.print("Your numbers: ");
        for (String s : array) {
            System.out.print(s + " ");
        }
        System.out.println();

        getShortestAndLongestNumber(array);
        getNumbersInAscendingByLengthOrder(array);
        getNumbersWithSmallerThanAverageLength(array);
        getNumberWithMinimumOfDifferentDigits(array);

    }

    // 1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

    public static void getShortestAndLongestNumber(List<String> array) {
        String shortestNumber = array.get(0);
        String longestNumber = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i).length() < shortestNumber.length()) {
                shortestNumber = array.get(i);
            } else if (array.get(i).length() > longestNumber.length()) {
                longestNumber = array.get(i);
            }
        }
        System.out.println("Shortest number is:" + shortestNumber);
        System.out.println("Longest number is:" + longestNumber);
        System.out.println();
    }

    // 2. Вывести числа в порядке возрастания значений их длины.

    public static void getNumbersInAscendingByLengthOrder(List<String> array) {
        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = 0; j < array.size() - 1 - i; j++) {
                if (array.get(j).length() > array.get(j + 1).length()) {
                    String swap = array.get(j + 1);
                    array.set(j +1, array.get(j));
                    array.set(j, swap);
                }
            }
        }
        System.out.print("Your numbers in ascending by length order: ");
        for (String s : array) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    // 3. Вывести на консоль те числа, длина которых меньше средней длины по всем числам, а также длину.

    public static void getNumbersWithSmallerThanAverageLength(List<String> array) {
        int sumLength = 0;
        double averageLength;
        for (String s : array) {
            sumLength += s.length();
        }
        averageLength = 1.0 * sumLength / array.size();
        System.out.println("Average length: " + averageLength);
        System.out.print("Numbers with length smaller than average: ");
        for (String s : array) {
            if (s.length() < averageLength) {
                System.out.print(s + " ");
            }
        }
        System.out.println();
    }

    // 4. Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
    
    public static void getNumberWithMinimumOfDifferentDigits(List<String> array) {
        char[] firstNumber = array.get(0).toCharArray();
        ArrayList<Character> firstNumberDigits = new ArrayList<>();
        firstNumberDigits.add(0, firstNumber[0]);
        for (int i = 1; i < firstNumber.length; i++) {
            if (firstNumberDigits.contains(firstNumber[i])) {
                break;
            } else {
                firstNumberDigits.add(firstNumber[i]);
            }
        }
        int index = 0;
        int length = firstNumberDigits.size();
        for (int j = 0; j < array.size(); j++) {
            char[] number = array.get(j).toCharArray();
            ArrayList<Character> digits = new ArrayList<>();
            digits.add(0, number[0]);
            for (int k = 1; k < number.length; k++) {
                if (digits.contains(number[k])) {
                    break;
                } else {
                    digits.add(number[k]);
                }
            }
            if (digits.size() < length) {
                length = digits.size();
                index = j;
            }
        }
        System.out.println("Number with minimum digits: " + array.get(index));
    }
}
