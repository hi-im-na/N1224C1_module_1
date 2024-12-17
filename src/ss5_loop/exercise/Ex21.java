package ss5_loop.exercise;

import utils.CheckInputType;
import utils.InputCommon;

public class Ex21 {


    /**
     * Check if a number is symmetry (so doi xung)
     */
    public static boolean isSymmetry(int n) {
        String numStr = Integer.toString(n);
        int numberOfDigit = numStr.length();

        for (int i = 0; i < numberOfDigit / 2; i++) {
            if (numStr.charAt(i) != numStr.charAt(numberOfDigit - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isDigitAsc(int n) {
        String numStr = Integer.toString(n);

        for (int i = 0; i < numStr.length() - 1; i++) {
            if (numStr.charAt(i) > numStr.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap so nguyen duong n: ");
            int n = ic.checkInputInt(CheckInputType.MIN, 0);

            System.out.println("La so doi xung: " + isSymmetry(n));
            System.out.println("La so nguyen to: " + isPrime(n));
            System.out.println("La so tang dan: " + isDigitAsc(n));
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
