package utils;

import java.util.Scanner;

public class InputCommon implements AutoCloseable {
    private final Scanner sc = new Scanner(System.in);


    public String checkInputString() {
        String result = "";
        while (true) {
            result = sc.nextLine();
            if (result == null || result.trim().isEmpty()) {
                System.err.print("Can not be blank. Please enter again: ");
            } else {
                return result;
            }
        }
    }

    public int checkInputInt() {
        while (true) {
            try {
                return Integer.parseInt(checkInputString());
            } catch (NumberFormatException e) {
                System.err.print("Please input a valid integer: ");
            }
        }
    }

    public double checkInputDouble() {
        while (true) {
            try {
                return Double.parseDouble(checkInputString());
            } catch (NumberFormatException e) {
                System.err.print("Please input a valid double: ");
            }
        }
    }

    @Override
    public void close() {
        try {
            sc.close();
        } catch (Exception e) {
            System.err.println("Error close InputValidate: " + e.getMessage());
        }
    }
}
