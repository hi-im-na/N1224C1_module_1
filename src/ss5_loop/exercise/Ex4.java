package ss5_loop.exercise;

import utils.CheckInputType;
import utils.InputCommon;

public class Ex4 {
    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap so n: ");
            int n = ic.checkInputInt(CheckInputType.MIN, 0);

            int count = 0;
            for (int i = 2; i <= n; i += 2) {
                ++count;
                if (i == n || i == n - 1) {
                    System.out.println(i);
                    return;
                }

                if (count % 3 == 0)
                    System.out.print(-i + ", ");
                else
                    System.out.print(i + ", ");
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
