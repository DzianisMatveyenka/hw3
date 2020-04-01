package com.itacademy;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(getSeason(number));
        System.out.println(getSeasonSwitch(number));
    }

    public static String getSeason(int month) {
//        [3; 5]
        if (month >= 3 && month <= 5) {
            return "весна";
        } else if (month >= 6 && month <= 8) {
            return "лето";
        } else if (month >= 9 && month <= 11) {
            return "осень";
        } else if (month == 12 || month == 1 || month == 2) {
            return "зима";
        } else {
            return "нет такой поры года";
        }
    }

    /**
     * byte, short, int, char, enum, String
     */
    public static String getSeasonSwitch(int month) {
        String result;
        switch (month) {
            case 1:
            case 2:
            case 12:
                result = "зима";
                break;
            case 3:
            case 4:
            case 5:
                result = "весна";
                break;
            case 6:
            case 7:
            case 8:
                result = "лето";
                break;
            case 9:
            case 10:
            case 11:
                result = "осень";
                break;
            default:
                result = "нет такой поры года";
                break;
        }

        return result;
    }
}
