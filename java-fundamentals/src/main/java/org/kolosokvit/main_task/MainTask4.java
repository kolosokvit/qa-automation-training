package org.kolosokvit.main_task;
//Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

import java.util.Scanner;

public class MainTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int conduct = 1;
        System.out.println("Enter your numbers, each number on a new line:");
        while (true) {
            String s = scanner.nextLine();
            if (s.equals("")) {
                break;
            } else {
                int nextNumber = Integer.parseInt(s);
                sum += nextNumber;
                conduct *= nextNumber;
            }
        }
        System.out.println("sum = " + sum);
        System.out.println("conduct = " + conduct);
    }
}
