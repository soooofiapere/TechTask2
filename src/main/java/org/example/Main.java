package org.example;

import java.util.List;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Main {

    public static int _min(List<Integer> list) {
        if (list.isEmpty()) {
            return 0; // Возвращаем 0, если список пуст
        }

        int min = list.get(0);
        for (int num : list) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int _max(List<Integer> list) {
        if (list.isEmpty()) {
            return 0; // Возвращаем 0, если список пуст
        }

        int max = list.get(0);
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int _sum(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }

    public static int _mult(List<Integer> list) {
        if (list.isEmpty()) {
            return 0; // Возвращаем 1, если список пуст
        }

        int mult = 1;
        for (int num : list) {
            mult *= num;
        }
        return mult;
    }

    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>();

        File file = new File("numbers.txt");

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] numbersArray = line.split(" ");

                for (String number : numbersArray) {
                    numbersList.add(Integer.parseInt(number));
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        }

        System.out.println("Содержимое списка: " + numbersList);
        System.out.println("Минимальное число: " + _min(numbersList));
        System.out.println("Максимальное число: " + _max(numbersList));
        System.out.println("Сумма чисел: " + _sum(numbersList));
        System.out.println("Произведение чисел: " + _mult(numbersList));
    }
}