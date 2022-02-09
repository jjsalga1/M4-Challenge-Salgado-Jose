package com.company;

public class SomeMath {
    public static int total5(int num1, int num2, int num3, int num4, int num5) {
        return num1 + num2 + num3 + num4 + num5;
    }

    public static double average5(int num1, int num2, int num3, int num4, int num5) {
        double five = 5;
        return (num1 + num2 + num3 + num4 + num5) / five;
    }

    public static double largest5(double num1, double num2, double num3, double num4, double num5) {
        double[] arr = {num1, num2, num3, num4, num5};
        double max = arr[0];

        for (double num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int total5result = total5(1, 2, 3, 4, 5);
        System.out.println("total5(1, 2, 3, 4, 5) result: " + total5result);

        double average5result = average5(1, 3, 5, 7, 9);
        System.out.println("average5(1, 3, 5, 7, 9) result: " + average5result);

        double largest5result = largest5(42.0, 35.1, 2.3, 40.2, 15.6);
        System.out.println("largest5(42.0, 35.1, 2.3, 40.2, 15.6) result: " + largest5result);
    }
}
