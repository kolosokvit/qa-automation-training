package org.kolosokvit.main_task;
// Отобразить в окне консоли аргументы командной строки в обратном порядке.

import java.util.Scanner;

public class MainTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arguments = scanner.nextLine();
        for (int i = arguments.length() - 1; i >= 0; i--) {
            System.out.print(arguments.charAt(i));
        }
    }
}
