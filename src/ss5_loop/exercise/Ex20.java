package ss5_loop.exercise;

import utils.enums.CheckInputLimit;
import utils.InputCommon;

public class Ex20 {
    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap so nguyen duong a: ");
            int a = ic.checkInputInt(CheckInputLimit.MIN, 0);
            System.out.print("Nhap so nguyen duong b: ");
            int b = ic.checkInputInt(CheckInputLimit.MIN, 0);
            System.out.print("Nhap so nguyen duong c: ");
            int c = ic.checkInputInt(CheckInputLimit.MIN, 0);

            long s = Ex11.factorial(a) + Ex11.factorial(b) + Ex11.factorial(c);
            System.out.println("S = " + s);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
