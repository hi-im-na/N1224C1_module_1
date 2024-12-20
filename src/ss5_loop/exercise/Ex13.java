package ss5_loop.exercise;

import utils.CheckInputType;
import utils.InputCommon;

public class Ex13 {
    public static int gcd(int a, int b) {
        int greatestCommonDivisor = 1;
        int min = Math.min(a, b);
        int max = Math.max(a, b);

        // gcd
        if (max % min == 0) {
            greatestCommonDivisor = min;
        } else {
            for (int i = min / 2; i > 1; i--) {
                if (a % i == 0 && b % i == 0) {
                    greatestCommonDivisor = i;
                }
            }
        }
        return greatestCommonDivisor;
    }

    public static int lcm(int a, int b) {
        int leastCommonMultiple = a * b;
        int min = Math.min(a, b);
        int max = Math.max(a, b);

        // lcm
        for (int i = max; i <= a * b; i += max) {
            if (i % min == 0) {
                leastCommonMultiple = i;
                break;
            }
        }
        return leastCommonMultiple;
    }

    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap so nguyen duong a: ");
            int a = ic.checkInputInt(CheckInputType.MIN, 0);

            System.out.print("Nhap so nguyen duong b: ");
            int b = ic.checkInputInt(CheckInputType.MIN, 0);


            // result
            System.out.println("Uoc chung lon nhat: " + gcd(a, b));
            System.out.println("Boi chung nho nhat: " + lcm(a, b));

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
