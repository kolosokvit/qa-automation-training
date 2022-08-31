package org.kolosokvit.main_task;
//Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

public class MainTask3 {
    public static void main(String[] args) {
        int rangeStart = 0;
        int rangeEnd = 100;
        int amountOfRandomNumbers = 10;
        for (int i = 0; i < amountOfRandomNumbers; i++) {
            System.out.println(rangeStart + (int)(Math.random() * rangeEnd));
        }
        for (int i = 0; i < amountOfRandomNumbers; i++) {
            System.out.print(rangeStart + (int)(Math.random() * rangeEnd) + " ");
        }
    }
}
