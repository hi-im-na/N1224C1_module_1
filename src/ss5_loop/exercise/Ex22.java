package ss5_loop.exercise;

import utils.enums.CheckInputLimit;
import utils.InputCommon;

public class Ex22 {
    public static boolean isSquareNumber(int n) {
        return Math.sqrt(n) % 1 == 0;
    }

    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap so nguyen duong a: ");
            int a = ic.checkInputInt(CheckInputLimit.MIN, 0);
            System.out.print("Nhap so nguyen duong b: ");
            int b = ic.checkInputInt(CheckInputLimit.MIN, a);

            int countSymmetricNumber = 0, countPrimeNumber = 0, countSquareNumber = 0;
            int sumSymmetricNumber = 0, sumPrimeNumber = 0, sumSquareNumber = 0;

            for (int i = a; i <= b; i++) {
                if (Ex21.isSymmetry(i)) {
                    countSymmetricNumber++;
                    sumSymmetricNumber += i;
                }
                if (Ex21.isPrime(i)) {
                    countPrimeNumber++;
                    sumPrimeNumber += i;
                }
                if (isSquareNumber(i)) {
                    countSquareNumber++;
                    sumSquareNumber += i;
                }
            }
            
            System.out.println("So luong so doi xung: " + countSymmetricNumber);
            System.out.println("Tong cac so doi xung: " + sumSymmetricNumber);
            System.out.println("So luong so nguyen to: " + countPrimeNumber);
            System.out.println("Tong cac so nguyen to: " + sumPrimeNumber);
            System.out.println("So luong so chinh phuong: " + countSquareNumber);
            System.out.println("Tong cac so chinh phuong: " + sumSquareNumber);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
