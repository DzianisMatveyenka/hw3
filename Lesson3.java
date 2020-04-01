package com.itacademy;

public class Lesson3 {

    public static void main(String[] args) {
        boolean test = true;
        testFunc1(test);
        testFunc2(test);
        testFunc3(2123);
    }

    /**
     * 3 if-else-if
     */
    public static void testFunc3(int value) {
        if (value > 0) {
            System.out.println("положительное");
        } else if (value < 0) {
            System.out.println("отрицательное");
        } else {
            System.out.println("ноль");
        }
    }

    /**
     * 2 вариант if-else
     */
    public static void testFunc2(boolean test) {
        if (test) {
            System.out.println("1. if сработал");
        } else {
            System.out.println("1. else сработал");
        }
    }

    /**
     * 1 вариант if
     */
    public static void testFunc1(boolean value) {
        if (value) {
            System.out.println("if сработал");
        }
    }

    //    [модификаторы], возвращаемое значение, название([параметры])
    public static boolean isЧетное(int value) {
        if (value % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
