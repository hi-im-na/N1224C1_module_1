package ss5_loop.exercise;

import utils.enums.CheckInputLimit;
import utils.InputCommon;

public class Ex7 {
    public static void fibonacci(int n) {
        int f1 = 0, f2 = 1, fn = 1;
        System.out.print("Day Fibonacci: ");
        while (fn <= n) {
            System.out.print(fn + " ");
            f1 = f2;
            f2 = fn;
            fn = f1 + f2;
        }
    }

    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap so n: ");
            int n = ic.checkInputInt(CheckInputLimit.MIN, 0);
            fibonacci(n);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
