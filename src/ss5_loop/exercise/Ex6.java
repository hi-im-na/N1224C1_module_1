package ss5_loop.exercise;

import utils.enums.CheckInputLimit;
import utils.InputCommon;

public class Ex6 {
    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap so n: ");
            int n = ic.checkInputInt(CheckInputLimit.MIN, 0);

            int count = 0;
            int space = 1;
            for (int i = 2; i <= 2 * n; i += 2) {

                if (i == 2 * n) {
                    System.out.println(i);
                    return;
                }

                if (count == space) {
                    space++;
                    count = 0;
                    System.out.print(-i + ", ");
                } else {
                    count++;
                    System.out.print(i + ", ");
                }
            }

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
