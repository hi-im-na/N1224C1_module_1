package ss5_loop.exercise;

import utils.CheckInputType;
import utils.InputCommon;

public class Ex2 {
    public static void main(String[] args) {

        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap so n: ");
            int n = ic.checkInputInt(CheckInputType.MIN, 0);

            for (int i = 1; i <= n; i += 2) {
                if (i == n || i == n - 1) {
                    System.out.println(i);
                    return;
                }
                System.out.print(i + ", ");
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
