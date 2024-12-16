package ss5_loop.exercise;

import utils.CheckInputType;
import utils.InputCommon;

public class Ex7 {
    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap so n: ");
            int n = ic.checkInputInt(CheckInputType.MIN, 0);

            int f1 = 0, f2 = 1, fn = 1;
            System.out.print("Day Fibonacci: ");
            while (fn <= n) {
                System.out.print(fn + " ");
                f1 = f2;
                f2 = fn;
                fn = f1 + f2;
            }

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
