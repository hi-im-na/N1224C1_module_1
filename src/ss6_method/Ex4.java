package ss6_method;

import utils.CheckInputType;
import utils.InputCommon;

import static ss5_loop.exercise.Ex13.gcd;

public class Ex4 {
    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap so nguyen duong a: ");
            int a = ic.checkInputInt(CheckInputType.MIN, 0);

            System.out.print("Nhap so nguyen duong b: ");
            int b = ic.checkInputInt(CheckInputType.MIN, 0);

            // result
            System.out.println("Uoc chung lon nhat: " + gcd(a, b));
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
