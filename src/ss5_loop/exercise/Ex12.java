package ss5_loop.exercise;

import utils.CheckInputType;
import utils.InputCommon;

public class Ex12 {
    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap so n: ");
            int n = ic.checkInputInt(CheckInputType.MIN, 0);

            int sum = 0;
            int product = 1;

            while (n > 0) {
                int digit = n % 10;
                sum += digit;
                product *= digit;
                n /= 10;
            }

            System.out.println("Tong cac chu so: " + sum);
            System.out.println("Tich cac chu so: " + product);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
