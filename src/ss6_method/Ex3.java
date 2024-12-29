package ss6_method;

import ss5_loop.exercise.Ex11;
import utils.enums.CheckInputLimit;
import utils.InputCommon;

public class Ex3 {
    public static int sumA(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumA(n - 1);
    }

    public static int sumB(int n) {
        if (n == 0) {
            return 0;
        }
        return n * n + sumB(n - 1);
    }

    public static double sumC(int n) {
        if (n == 0) {
            return 0;
        }
        return 1.0 / n + sumC(n - 1);
    }

    public static double productD(int n) {
        if (n == 0) {
            return 1;
        }
        return n * productD(n - 1);
    }

    public static int sumE(int n) {
        if (n == 0) {
            return 0;
        }
        return Ex11.factorial(n) + sumE(n - 1);
    }

    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap so n: ");
            int n = ic.checkInputInt(CheckInputLimit.MIN, 0);

            System.out.println("Tong A = " + sumA(n));
            System.out.println("Tong B = " + sumB(n));
            System.out.println("Tong C = " + sumC(n));
            System.out.println("Tich D = " + productD(n));
            System.out.println("Tong E = " + sumE(n));
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
