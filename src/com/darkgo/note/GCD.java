package com.darkgo.note;

/**
 * <p>
 *
 * </p>
 *
 * @author ShiWu
 * @since 2023/1/14
 */
public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(4, 8));
        System.out.println(gcd1(4, 8));
    }

    private static int gcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
        return num1;
    }

    private static int gcd1(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcd1(num2, num1 % num2);
    }

    private static int lcm(int num1, int num2) {
        return num1 * num2 / gcd(num1, num2);
    }
}
