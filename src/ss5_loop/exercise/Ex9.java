package ss5_loop.exercise;

import utils.enums.CheckInputLimit;
import utils.InputCommon;

public class Ex9 {
    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap so n: ");
            int n = ic.checkInputInt(CheckInputLimit.MIN, 0);

            int a = 0;
            int count = 0; // 1 is positive, 0 is negative

            while (a <= n) {
                count++;
                a = 2 * a + 1;
                if (a > n) return;
                System.out.print((count % 2 == 0 ? -a : a) + " ");
            }

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
