package ss5_loop.exercise;

import utils.CheckInputType;
import utils.InputCommon;

public class Ex11 {
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap so n: ");
            int n = ic.checkInputInt(CheckInputType.MIN, 0);

            double s = 0;
            for (int i = 1; i <= 2 * n - 1; i += 2) {
                s += 1.0 / factorial(i);
            }

            System.out.println("S = " + s);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
