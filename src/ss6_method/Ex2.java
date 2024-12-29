package ss6_method;

import ss5_loop.exercise.Ex21;
import ss5_loop.exercise.Ex22;
import utils.enums.CheckInputLimit;
import utils.InputCommon;

public class Ex2 {
    public static int reversedNumber(int n) {
        int reverseNumber = 0;
        while (n != 0) {
            reverseNumber = reverseNumber * 10 + n % 10;
            n /= 10;
        }
        return reverseNumber;
    }

    public static int sumOddDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            n /= 10;
        }
        return sum;
    }

    public static int sumPrimeDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            if (Ex21.isPrime(digit)) {
                sum += digit;
            }
            n /= 10;
        }
        return sum;
    }

    public static int sumSquareDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            if (Ex22.isSquareNumber(digit)) {
                sum += digit;
            }
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap so n: ");
            int n = ic.checkInputInt(CheckInputLimit.MIN, 0);

            System.out.println("So dao nguoc la: " + reversedNumber(n));
            System.out.println("La so doi xung: " + Ex21.isSymmetry(n));
            System.out.println("La so chinh phuong: " + Ex22.isSquareNumber(n));
            System.out.println("La so nguyen to: " + Ex21.isPrime(n));
            System.out.println("Tong cac chu so le: " + sumOddDigits(n));
            System.out.println("Tong cac chu so nguyen to: " + sumPrimeDigits(n));
            System.out.println("Tong cac chu so chinh phuong: " + sumSquareDigits(n));
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
