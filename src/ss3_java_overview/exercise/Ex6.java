package ss3_java_overview.exercise;

import utils.InputCommon;

public class Ex6 {
    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            // input
            System.out.print("Nhap so xe: ");
            int carNumber = ic.checkInputInt();

            // calc
            int sum = 0;
            int temp = carNumber; // bien nay dung de luu tru tam so khi div cho 10

            while (true) {
                sum += temp % 10;
                if (temp < 10) {
                    break;
                }
                temp /= 10;
            }

            // output
            System.out.println("So nut cua xe: " + (sum % 10));

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
