package ss5_loop.exercise;

import utils.CheckInputType;
import utils.InputCommon;

public class Ex21 {


    public static boolean isDoiXung(int n) {
        String numStr = Integer.toString(n);
        int numberOfDigit = numStr.length();

        for (int i = 0; i < numberOfDigit / 2; i++) {
            if (numStr.charAt(i) != numStr.charAt(numberOfDigit - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap so nguyen duong n: ");
            int n = ic.checkInputInt(CheckInputType.MIN, 0);

            System.out.println("La so doi xung: " + isDoiXung(n));
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
