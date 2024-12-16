package ss4_condition_structure.exercise;

import utils.InputCommon;

public class Ex2 {
    public static String usingIfElse(int n) {
        if (n == 1) {
            return "One";
        } else if (n == 2) {
            return "Two";
        } else if (n == 3) {
            return "Three";
        } else if (n == 4) {
            return "Four";
        } else if (n == 5) {
            return "Five";
        } else if (n == 6) {
            return "Six";
        } else if (n == 7) {
            return "Seven";
        } else if (n == 8) {
            return "Eight";
        } else if (n == 9) {
            return "Nine";
        } else {
            return "Other number";
        }
    }

    public static String usingSwitchCase(int n) {
        return switch (n) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> "Other number";
        };
    }

    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            //input
            System.out.print("Enter a number from 1 - 9: ");
            int n = ic.checkInputInt(1, 9);

            //output
            System.out.println("Using if-else: " + usingIfElse(n));
            System.out.println("Using switch-case: " + usingSwitchCase(n));
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
