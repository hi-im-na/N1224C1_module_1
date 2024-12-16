package ss5_loop.exercise;

import utils.CheckInputType;
import utils.InputCommon;

public class Ex14 {
    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap so n: ");
            int n = ic.checkInputInt(CheckInputType.MIN, 1);

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == n - 1 || i == 0 || i == n - 1)
                        System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
