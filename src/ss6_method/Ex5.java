package ss6_method;

import utils.enums.CheckInputLimit;
import utils.InputCommon;

public class Ex5 {
    /**
     * Print to nth Fibonacci number
     *
     * @param n the nth number
     */
    public static void fibonacci(int n) {
        int f0 = 0, f1 = 1, fn = 1;
        int count = 0;
        System.out.print("Day Fibonacci: ");
        while (count < n) {
            if (count == 0) {
                System.out.print(f0 + " ");
                count++;
                continue;
            }
            System.out.print(fn + " ");
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
            count++;
        }
    }

    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap so nguyen duong n: ");
            int n = ic.checkInputInt(CheckInputLimit.MIN, 0);

            fibonacci(n);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
