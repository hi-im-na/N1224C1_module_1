package ss5_loop.exercise;

import utils.enums.CheckInputLimit;
import utils.InputCommon;

public class Ex10 {
    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap so n: ");
            int n = ic.checkInputInt(CheckInputLimit.MIN, 0);

            double s = 0;
            for (int i = 1; i <= n; i++) {
                s += 1.0 / i;
            }

            System.out.println("S = " + s);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
