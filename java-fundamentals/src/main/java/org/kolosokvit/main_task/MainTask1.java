package org.kolosokvit.main_task;
//Приветствовать любого пользователя при вводе его имени через командную строку.

import java.util.Scanner;

public class MainTask1 {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
