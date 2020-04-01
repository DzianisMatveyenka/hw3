package com.itacademy;

import java.util.Scanner;

/**
 * Имеется целое число, вводимое пользователем с консоли. Это число - сумма денег в рублях.
 * Вывести это число, добавив к нему слово "рубль" в правильном падеже ("рубль", "рублей", "рубля")
 */
public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rubles = scanner.nextInt();

        System.out.println(getDescription(rubles));
        System.out.println(getDescription2(rubles));
    }

    /**
     * 121 % 10
     * 0-19
     */
    public static String getDescription(int rubles) {
        int ostatokNa10 = rubles % 10;
        int ostatokNa100 = rubles % 100;
        if ((ostatokNa10 == 1) && (ostatokNa100 != 11)) {
            return rubles + " рубль";
        } else if ((ostatokNa10 >= 2 && ostatokNa10 <= 4) && !(ostatokNa100 >= 12 && ostatokNa100 <= 14)) {
            return rubles + " рубля";
        } else {
            return rubles + " рублей";
        }
    }

    public static String getDescription2(int rubles) {
        int ostatokNa10 = rubles % 10;
        int ostatokNa100 = rubles % 100;
        if (ostatokNa10 >= 5 || (ostatokNa100 >= 10 && ostatokNa100 <= 19)) {
            return rubles + " рублей";
        } else if (ostatokNa10 == 1) {
            return rubles + " рубль";
        } else {
            return rubles + " рубля";
        }
    }
}
