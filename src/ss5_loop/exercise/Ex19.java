package ss5_loop.exercise;

import utils.CheckInputType;
import utils.InputCommon;

public class Ex19 {
    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap so nguyen duong n: ");
            int n = ic.checkInputInt(CheckInputType.MIN, 0);

            int temp = n; // number to be divided
            String binStr = "";
            while (temp > 0) {
                binStr = temp % 2 + binStr;
                temp /= 2;
            }

            System.out.println("He nhi phan: " + binStr);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
